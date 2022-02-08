package com.wbl.common;

public class Swap {
    public void withoutTemp(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Swapping without using third variable");
        System.out.println("Result is :: " + " x = " + x + ", y = " + y);
    }


    public void withTemp(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Swapping using third variable");
        System.out.println("Result is :: " + " x = " + x + ", y = " + y);

    }
}
