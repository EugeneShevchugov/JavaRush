package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        private Socket socket;
        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            ConsoleHelper.writeMessage("Установленно соединение с адресом " + socket.getRemoteSocketAddress());
            String clientName = null;
            //Создаем Connection
            try (Connection connection = new Connection(socket)) {
                //Выводить сообщение, что установлено новое соединение с удаленным адресом
                ConsoleHelper.writeMessage("Подключение к порту: " + connection.getRemoteSocketAddress());
                //Вызывать метод, реализующий рукопожатие с клиентом, сохраняя имя нового клиента
                clientName = serverHandshake(connection);
                //Рассылать всем участникам чата информацию об имени присоединившегося участника (сообщение с типом USER_ADDED)
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, clientName));
                //Сообщать новому участнику о существующих участниках
                notifyUsers(connection, clientName);
                //Запускать главный цикл обработки сообщений сервером
                serverMainLoop(connection, clientName);
                //После того как все исключения обработаны, удаляем запись из connectionMap
                connectionMap.remove(clientName);
                //и отправлялем сообщение остальным пользователям
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, clientName));

                ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");


            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка при обмене данными с удаленным адресом");
            }



        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    String s = userName + ": " + message.getData();
                    Message currentMessage = new Message(MessageType.TEXT, s);
                    sendBroadcastMessage(currentMessage);
                } else {
                    ConsoleHelper.writeMessage("Error");
                }
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            while (true) {
                // Сформировать и отправить команду запроса имени пользователя
                connection.send(new Message(MessageType.NAME_REQUEST));
                // Получить ответ клиента
                Message message = connection.receive();

                // Проверить, что получена команда с именем пользователя
                if (message.getType() == MessageType.USER_NAME) {

                    //Достать из ответа имя, проверить, что оно не пустое
                    if (message.getData() != null && !message.getData().isEmpty()) {

                        // и пользователь с таким именем еще не подключен (используй connectionMap)
                        if (connectionMap.get(message.getData()) == null) {

                            // Добавить нового пользователя и соединение с ним в connectionMap
                            connectionMap.put(message.getData(), connection);
                            // Отправить клиенту команду информирующую, что его имя принято
                            connection.send(new Message(MessageType.NAME_ACCEPTED));

                            // Вернуть принятое имя в качестве возвращаемого значения
                            return message.getData();
                        }
                    }
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String key : connectionMap.keySet()) {
                Message message = new Message(MessageType.USER_ADDED, key);
                if (!key.equals(userName)) {
                    connection.send(message);
                }
            }
         }
    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for(Connection connect : connectionMap.values()) {
                connect.send(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Сообщение не доставлено!");
        }
    }

    public static void main(String[] args) throws IOException {
        ConsoleHelper.writeMessage("Введите порт сервера: ");
        int serverPort = ConsoleHelper.readInt();

        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {

            ConsoleHelper.writeMessage("Сервер запущен");

            while (true) {
                //Слушаем
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                //запускаем handler
                handler.start();
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

    }
}
