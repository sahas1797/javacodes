package com.wbl.commontest;

import com.wbl.common.Swap;
import org.testng.annotations.Test;

public class SwapTest {

    Swap s= new Swap();
    @Test
    public void withoutTemp() {

        s.withoutTemp(2,5);
    }
    @Test
    public void withTemp(){

        s.withTemp(5,3);
    }
}
