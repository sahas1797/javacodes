package com.wbl.StringTest;

import com.wbl.String.Palindrome;
import org.testng.annotations.Test;

public class PalindromeTest {

    @Test
    public void runPalindrome(){
        Palindrome p= new Palindrome();
        p.checkPalindrome();
    }
}
