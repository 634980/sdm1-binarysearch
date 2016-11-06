package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int size;
    public static int element;
    public static void main(String[] args) {
        // write your code here
        Readarray ra = new Readarray();
        int[] display1 = ra.readArray();
        Sortarray sa = new Sortarray();
        sa.sortArray(display1);
        System.out.println(Arrays.toString(display1));
        Searcharray sea=new Searcharray();
        int x=sea.searchArray(display1,element);
        if(x==1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

