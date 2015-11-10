package com.wait.notify;

/**
 * Created by yl on 10.11.15.
 */
import java.util.Date;

public class WaiterThread implements Runnable {

        Object object;

        public WaiterThread(Object object) {
            this.object = object;
        }

        public void run() {
            synchronized (object) {
                try {
                    System.out.println();
                    System.out.println("WaiterThread: I am just waiting, current date is " + new Date());
                    System.out.println();
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("WaiterThread: End of waiting. current date is " + new Date());
            System.out.println();
            System.out.println("WaiterThread: I got the object " + object.toString());
        }


}
