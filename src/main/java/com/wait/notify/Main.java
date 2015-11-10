package com.wait.notify;


/**
 * Created by yl on 10.11.15.
 */
public class Main {

    public static void main(String[] args) {

        Object object = new Object();


        WaiterThread waiterThread = new WaiterThread(object);
        Thread thread_waiterThread = new Thread(waiterThread, "waiterThread");
        thread_waiterThread.start();

        NotifierThread notifierThread = new NotifierThread(object);
        Thread thread_notifierThread = new Thread(notifierThread, "notifierThread");
        thread_notifierThread.start();

    }

}
