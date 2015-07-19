package com.threadExp.runnableAndThread;

/**
 * Created by maheshwar on 6/27/2015.
 */
public class HeavyWorkRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            long start = System.currentTimeMillis();
            Thread.sleep(1000);
            System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        System.out.println("Doing doDBProcessing...");
        Thread.sleep(5000);
    }
}
