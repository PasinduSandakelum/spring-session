package com.pasindu.lambda;

public class PrintProcess {
    Printer printer = e -> System.out.println(e);
    public void printHtml(){
        printer.print("<Head>");
    }
    public void printExt(){
        printer.print("external");
    }

    public static void main(String[] args) {
        PrintProcess printProcess = new PrintProcess();
        printProcess.printHtml();
        printProcess.printExt();
    }
}
