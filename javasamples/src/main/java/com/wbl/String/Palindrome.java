package com.wbl.String;

public class Palindrome {

    public void checkPalindrome() {

        String str= "Sahas", rev = "";

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equalsIgnoreCase(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
