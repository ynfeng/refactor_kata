package com.github.ynfeng.refactor.extract_function;

import java.time.LocalDate;

public class Clock {
    public static LocalDate today() {
        return LocalDate.now();
    }
}
