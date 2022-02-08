package com.wbl.commontest;

import com.wbl.common.Prime;
import org.testng.annotations.Test;

public class PrimeTest {
    @Test
    public void runPrime(){
        Prime p = new Prime();
        p.primeCheck();
    }
}
