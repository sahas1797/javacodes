package com.wbl.common;

public class Factorial {

    ///Using Recursion
    public void withRecursion() {
        int i, fact = 1;
        int number = 4;
        fact = factorial(number);
        System.out.println("This is using Recursive function :");
        System.out.println("Factorial of " + number + " is: " + fact);
    }
    //Recursion Function
    public int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


    ///Using Non-Recursion
    public void withoutRecursion(){
        int i, fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Using Non-Recursive function");
        System.out.println("Factorial of "+number+" is: "+fact);
    }


}


