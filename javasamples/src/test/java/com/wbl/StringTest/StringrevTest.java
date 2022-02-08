package com.wbl.StringTest;

import com.wbl.String.Stringrev;
import org.testng.annotations.Test;

public class StringrevTest {
    @Test
    public void runAStringrev(){
        Stringrev sr= new Stringrev();
        sr.revString();
    }
}
