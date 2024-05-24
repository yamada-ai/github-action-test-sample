package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilTest {
    @Test
    void testPower1(){
        double answer = MathUtil.power(0, -1);
        assertEquals(Double.POSITIVE_INFINITY, answer, "TC1と結果が異なる");
    }

    @Test
    void testPower2(){
        double answer = MathUtil.power(2, 2);
        assertEquals(4.0, answer, "TC2と結果が異なる");
    }

    @Test
    void testPower3(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class, ()->{MathUtil.power(2, 100);}, "TC3と結果が異なる");
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC3と結果が異なる");
    }
}
