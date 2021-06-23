package com.github.ynfeng.refactor.extract_function;

public class Order {
    public final int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public int amount() {
        return amount;
    }
}
