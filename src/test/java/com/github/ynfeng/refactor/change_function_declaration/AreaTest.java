package com.github.ynfeng.refactor.change_function_declaration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

class AreaTest {

    @Test
    void 来自新英格兰地区() {
        Customer customer = new Customer("a person");
        Address address = new Address();
        address.state = "MA";
        customer.address = address;

        assertThat(Area.inNewEngland(customer), is(true));
    }

    @Test
    void 来自非新英格兰地区() {
        Customer customer = new Customer("a person");
        Address address = new Address();
        address.state = "CA";
        customer.address = address;

        assertThat(Area.inNewEngland(customer), is(false));
    }

}
