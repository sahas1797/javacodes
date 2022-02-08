package com.wbl.common;

public class Armstrong {

    public void checkArmstrong(int n) {
        int actualNumber, rem, res = 0;
        actualNumber = n;

        while (actualNumber != 0) {
            rem = actualNumber % 10;
            res += Math.pow(rem, 3);
            actualNumber /= 10;
        }
        if (res == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}

