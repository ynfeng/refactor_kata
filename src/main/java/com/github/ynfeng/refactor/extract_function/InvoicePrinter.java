package com.github.ynfeng.refactor.extract_function;

import java.time.LocalDate;

public class InvoicePrinter {

    public static void printOwing(Invoice invoice) {
        int outstanding = 0;

        System.out.println("***********************");
        System.out.println("**** Customer Owes ****");
        System.out.println("***********************");

        // calculate outstanding
        for (Order o : invoice.orders()) {
            outstanding += o.amount();
        }

        // record due date
        LocalDate today = Clock.today();
        invoice.dueDate(today.plusDays(30));

        // print details
        System.out.println(String.format("name: %s", invoice.customer()));
        System.out.println(String.format("amount: %d", outstanding));
        System.out.println(String.format("due: %s", invoice.dueDate().toString()));
    }
}
