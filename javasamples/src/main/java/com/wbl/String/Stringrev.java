package com.wbl.String;

public class Stringrev {

    public void revString() {

        String input = "Innovapath.Inc";

        char[] ch = input.toCharArray();
        System.out.println("The reverse of the Given String is::");
        for (int i = ch.length - 1; i >= 0; i--)

            System.out.println(ch[i]);
    }
}


