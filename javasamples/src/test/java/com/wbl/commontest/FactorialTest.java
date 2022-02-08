package com.wbl.commontest;

import com.wbl.common.Factorial;
import org.testng.annotations.Test;

public class FactorialTest {

    Factorial f= new Factorial();

    @Test
    public void runRecursion(){

        f.withRecursion();
    }
    @Test
    public void runNonRecursion(){

        f.withoutRecursion();
    }


}
