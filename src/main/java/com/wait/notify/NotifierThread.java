package com.wait.notify;

/**
 * Created by yl on 10.11.15.
 */
import java.util.Date;

public class NotifierThread implements Runnable {

    Object object;

    public NotifierThread(Object object) {
        this.object = object;
    }

    public void run() {


        try {
            System.out.println();
            System.out.println("NotifierThread: I am begin of sleeping, current date is " + new Date());
            System.out.println();
            Thread.sleep(3000);
            System.out.println("NotifierThread: I am end of sleeping, current date is " + new Date());
            System.out.println();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        synchronized (object) {
            System.out.println("NotifierThread: Hallo any thread, please not let object wait anymore.  " + new Date());
            System.out.println();
            object.notify();
        }

    }

}