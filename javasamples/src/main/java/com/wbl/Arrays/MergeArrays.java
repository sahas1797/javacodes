package com.wbl.Arrays;

import java.util.*;

public class MergeArrays {

    public void arrayMerge(){

        int[] arr1 = {56,78,90,32,67,12};
        int[] arr2 = {11,14,9,5,2,23,15};

        int length = arr1.length + arr2.length;

        int[] res = new int[length];

        int pos = 0;
        for (int element : arr1)
        {
            res[pos] = element;
            pos++;
        }

        for (int element : arr2)
        {
            res[pos] = element;
            pos++;
        }

        System.out.println("The Merged array is :: "+Arrays.toString(res));
    }
}

