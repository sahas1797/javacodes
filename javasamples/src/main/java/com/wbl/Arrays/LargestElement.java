package com.wbl.Arrays;

public class LargestElement {

    public void largestEle(){
        int[] a= new int[] {3,6,89,45,2,25};

        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        System.out.println("Largest element in the given Array is ::"+max);

    }

}
