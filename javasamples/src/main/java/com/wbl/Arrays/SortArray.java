package com.wbl.Arrays;

public class SortArray {

    public void arraySort(){

        int [] arr = new int [] {5, 2, 8, 7, 1,23,0};
        int x = 0;

        System.out.println("Before Sorting the array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array after sorting in ascending order: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}

