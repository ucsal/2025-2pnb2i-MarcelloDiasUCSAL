package br.com.mariojp.solid.isp;

public class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void print(String content){
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String targetFile){
        System.out.println("Scanning to " + targetFile);
    }
}
