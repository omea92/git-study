package com.example.gitstudy.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        //given
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 20;

        int expected = 35;

        //when
        int actual = calculator.sum(a, b);

        //then
        assertEquals(expected, actual);
    }
}