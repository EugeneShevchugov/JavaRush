package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName()+ ".resources.common_en");

    public static String readString() throws InterruptOperationException {
        String input = "";
        try {
            input = bis.readLine();
            if (input.equalsIgnoreCase("exit")) {
                throw new InterruptOperationException();
            }
        } catch (IOException ignored) {}
        return input;
    }

    public static void printExitMessage() {
        ConsoleHelper.writeMessage(res.getString("the.end"));
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        writeMessage("Пожалуйста введите код валюты!");
        String currency = null;

        while ((currency = readString()).length() != 3) {
            writeMessage("Код должен содержать 3 символа!");
            writeMessage("Пожалуйста введите код валюты!");
        }

        return currency.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] cash;
        while (true) {
            writeMessage("Пожалуйста введите два целых положительных числа!");

            try {
                cash = readString().split(" ");
                if (Integer.parseInt(cash[0]) > 0 && Integer.parseInt(cash[1]) > 0 && cash.length==2) break;
            } catch (Exception e) {
                writeMessage("Код должен содержать 2 положительных числа!");
                continue;
            }
            writeMessage("Код должен содержать 2 положительных числа!");

        }
        return cash;
    }

    public static Operation askOperation() throws InterruptOperationException {
        do {
            writeMessage("Choice operation:\n1) INFO\n2) DEPOSIT\n3) WITHDRAW\n4) EXIT");
            try {
                String input = readString();
                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(input));
            } catch (IllegalArgumentException e) {
                writeMessage("Error in inputing Opeartion, Try Again: ");
                continue;
            }
        } while (true);
    }

}
