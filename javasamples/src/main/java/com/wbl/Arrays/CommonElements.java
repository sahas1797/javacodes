package com.wbl.Arrays;
import java.util.*;

public class CommonElements {


    public void similarElement(){

        int a[]={1,4,6,8,0,12,15,23};
        int b[]={2,1,23,32,0,8,4};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : a) {
            set1.add(i);
        }
        for (int i : b) {
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println("Common elements from the given two arrays ::" + set1);
    }
}
