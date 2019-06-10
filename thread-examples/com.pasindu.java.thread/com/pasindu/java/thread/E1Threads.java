package com.pasindu.java.thread;

public class E1Threads {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();

//        System.out.println("This is from main thread");
        for (int i = 0; i < 100; i++)
            System.out.println("main " + i);
    }
}
