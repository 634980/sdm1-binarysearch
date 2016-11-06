package com.company;

import java.util.Scanner;

/**
 * Created by shwetha on 9/19/2016.
 */
public class Readarray {
    public static int size;

    public int[] readArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        size = scan.nextInt();
        int[] array1 = new int[size];
        for (int a1 = 0; a1 < array1.length; a1++)
        {
            array1[a1]=scan.nextInt();
        }

        return array1;
    }
}
