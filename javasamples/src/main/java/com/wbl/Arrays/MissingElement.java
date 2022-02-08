package com.wbl.Arrays;

public class MissingElement {

    public void findElement(){

        int [] a= new int []{1,2,4,5,6};
        int n=a.length;
        int total=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            total-=a[i];
        System.out.println(total);
    }

}
