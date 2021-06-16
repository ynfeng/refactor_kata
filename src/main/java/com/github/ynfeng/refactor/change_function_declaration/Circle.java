package com.github.ynfeng.refactor.change_function_declaration;

public class Circle {

    /**
     * 改函数名称 circum -> circumference
     */
    public static double circum(double radius) {
        return 2 * Math.PI * radius;
    }
}
