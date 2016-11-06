package com.company;

import java.util.Scanner;

/**
 * Created by shwetha on 9/19/2016.
 */
public class Searcharray {
    public int searchArray(int[] array1,int element)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        element=scan.nextInt();
        int low=0;
        int high=array1.length-1;
        while(high>=low)
        {
            int mid=(low+high)/2;
            if(array1[mid]==element)
            {
                return 1;
            }
            else if(array1[mid]<element)
            {
                low=mid+1;
            }
            else if(array1[mid]>element)
            {
                high=mid-1;
            }
        }
        return 0;
    }
}
