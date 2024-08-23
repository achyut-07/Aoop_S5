package com.RomanNumeralTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanNumeralConverterTest {
	private RomanNumeralConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanNumeralConverter();
    }

    @Test
    public void testBasicNumbers() {
        assertEquals("I", converter.intToRoman(1));
        assertEquals("IV", converter.intToRoman(4));
        assertEquals("IX", converter.intToRoman(9));
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("L", converter.intToRoman(50));
        assertEquals("XC", converter.intToRoman(90));
        assertEquals("C", converter.intToRoman(100));
        assertEquals("CD", converter.intToRoman(400));
        assertEquals("D", converter.intToRoman(500));
        assertEquals("CM", converter.intToRoman(900));
        assertEquals("M", converter.intToRoman(1000));
    }


}
