package com.company;

/**
 * Created by shwetha on 9/19/2016.
 */
public class Sortarray {
    public int size;
    public int temp;
    public int[] sortArray(int[] array1)
    {
        for(int s1 = 0; s1<array1.length;s1++)
        {
            for(int s2=s1+1;s2<array1.length;s2++)
            {
                if(array1[s1]>array1[s2])
                {
                    temp=array1[s1];
                    array1[s1]=array1[s2];
                    array1[s2]=temp;
                }
                  /*else
                  {
                      break;
                  }*/
            }
        }
        return array1;
    }
}

