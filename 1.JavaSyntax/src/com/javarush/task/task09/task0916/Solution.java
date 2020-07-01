package com.javarush.task.task09.task0916;

//import com.sun.xml.internal.ws.api.model.CheckedException;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) throws IOException, NoSuchFieldException, RemoteException {
        try {
            handleExceptions(new Solution());
        }
        catch (Exception e) {

        }

    }

    public static void handleExceptions(Solution obj) throws IOException, NoSuchFieldException, RemoteException {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
