package com.ryder.chromedriver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void testAdd(){
        assertEquals(42, Integer.sum(19,23));
    }

    @Test
    public void testDivide(){
        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(2,0);
        });
    }

}
