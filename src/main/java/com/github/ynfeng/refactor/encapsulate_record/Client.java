package com.github.ynfeng.refactor.encapsulate_record;

import java.util.HashMap;
import java.util.Map;

public class Client {
    /**
     * 把它封装成类
     */
    private static final Map<String, String> organization = new HashMap<>();

    static {
        organization.put("name", "Acme Gooseberries");
        organization.put("country", "GB");
    }

    public static void main(String[] args) {
        String result = String.format("<h1>%s</h1>", organization.get("name"));
        organization.put("name", "newName");
    }
}
