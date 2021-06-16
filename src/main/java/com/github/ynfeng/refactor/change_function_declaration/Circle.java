package com.github.ynfeng.refactor.change_function_declaration;

public class Circle {

    public static double circum(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println(circum(5));
    }
}
