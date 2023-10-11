package com.aleksei;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PrimesInNumberTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimesInNumber.factors(lst));
    }

}