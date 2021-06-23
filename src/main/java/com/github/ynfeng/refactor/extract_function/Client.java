package com.github.ynfeng.refactor.extract_function;

public class Client {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("jack");
        invoice.addOrder(new Order(30));
        invoice.addOrder(new Order(60));

        InvoicePrinter.printOwing(invoice);
    }
}
