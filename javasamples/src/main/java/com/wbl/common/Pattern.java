package com.wbl.common;

public class Pattern {

    public void drawPattern(int row){
        int i, j;

        for(i = 1; i <= row; i++) {
            for(j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
