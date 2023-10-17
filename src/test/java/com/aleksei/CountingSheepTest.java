package com.aleksei;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CountingSheepTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  null,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 16, new CountingSheep().countSheeps(array1));
    }
//    @Test
//    public void test2() {
//        assertEquals("There are 17 sheeps in total", 0, new CountingSheep().countSheeps(null));
//    }
}