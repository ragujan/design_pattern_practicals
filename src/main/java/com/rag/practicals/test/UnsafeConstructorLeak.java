package com.rag.practicals.test;

public class UnsafeConstructorLeak {

    private int value;

    public UnsafeConstructorLeak() {
        // Leaking 'this' reference in the constructor
        WorkerThread workerThread = new WorkerThread(this);
        workerThread.start();

        // Simulating some time-consuming initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Completing the construction by setting a value
        this.value = 42;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        UnsafeConstructorLeak instance = new UnsafeConstructorLeak();
        for (int i = 0; i < 200; i++) {
            System.out.println("Main thread: " + instance.getValue());
        }
    }

    private static class WorkerThread extends Thread {
        private UnsafeConstructorLeak instance;

        public WorkerThread(UnsafeConstructorLeak instance) {
            this.instance = instance;
        }

        @Override
        public void run() {
            // Accessing the object before its construction is finished
            for (int i = 0; i < 1000; i++) {

                System.out.println("Worker thread: " + instance.getValue());
            }
        }
    }
}
