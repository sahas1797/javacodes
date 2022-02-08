package com.wbl.commontest;

import com.wbl.common.Armstrong;
import org.testng.annotations.Test;

public class ArmstrongTest {
    @Test
    public void runArmstrong() {
        Armstrong a = new Armstrong();
        a.checkArmstrong(371);
    }
}
