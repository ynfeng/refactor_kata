package com.github.ynfeng.refactor.change_function_declaration;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void 计算圆周长() {
        assertThat(Circle.circum(3.0), is(18.84955592153876));
    }

}
