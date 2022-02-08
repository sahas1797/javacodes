package com.wbl.common;
public class FizzBuzz {

        public void implement(int n){
            for (int i=1; i<=n; i++)
            {
                if (i%15==0)
                    System.out.print("FizzBuzz"+" ");
                else if (i%5==0)
                    System.out.print("Buzz"+" ");
                else if (i%3==0)
                    System.out.print("Fizz"+" ");

                else // print the numbers
                    System.out.print(i+" ");
            }
        }
    }

