package com.github.ynfeng.refactor.change_function_declaration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void 可以添加预定人() {
        Book book = new Book();
        book.addReservation(new Customer("a person"));

        assertThat(book.reservations(), is(Arrays.asList(new Customer("a person"))));
    }
}
