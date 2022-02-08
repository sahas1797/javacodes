package com.wbl.commontest;

import com.wbl.common.Fibonacci;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test
    public void runfibonacci() {
        Fibonacci f = new Fibonacci();
        f.fibonacci();
    }
}
