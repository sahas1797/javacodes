package com.wbl.commontest;

import com.wbl.common.FizzBuzz;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest(){
        FizzBuzz fz= new FizzBuzz();
        fz.implement(10);

    }

}
