package com.github.ynfeng.refactor.change_function_declaration;

import java.util.Arrays;

public class Area {
    /**
     * 接收state参数
     */
    public static boolean inNewEngland(Customer customer) {
        return Arrays.asList("MA","CT","ME","VT","NH","RI")
            .contains(customer.address.state);
    }
}
