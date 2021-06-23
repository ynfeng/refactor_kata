package com.github.ynfeng.refactor.extract_function;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Invoice {
    private final List<Order> orders = new ArrayList<>();
    private LocalDate dueDate;
    private final String customer;

    public Invoice(String customer) {
        this.customer = customer;
    }

    public List<Order> orders() {
        return Collections.unmodifiableList(orders);
    }

    public void dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate dueDate() {
        return dueDate;
    }

    public String customer() {
        return customer;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
