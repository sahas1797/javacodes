package com.wbl.commontest;

import com.wbl.common.Pattern;
import org.testng.annotations.Test;

public class PatternTest {

    @Test
    public void  runPattern(){
        Pattern p= new Pattern();
        p.drawPattern(6);
    }
}
