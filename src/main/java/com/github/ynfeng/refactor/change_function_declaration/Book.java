package com.github.ynfeng.refactor.change_function_declaration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
    private final List<Customer> reservations = new ArrayList<>();

    /**
     * 添加一个参数:isPriority
     */
    public void addReservation(Customer customer) {
        reservations.add(customer);
    }

    public List<Customer> reservations() {
        return Collections.unmodifiableList(reservations);
    }
}
