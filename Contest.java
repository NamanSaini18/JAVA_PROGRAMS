// Program to find Smallest and Largest elements from One Dimensional Array Elements.

// To find Smallest element from the Array - We will assume that first element is smallest and assign it in a variable and then compare each element from array with the variable,
// if any of the element is smaller than variable assign that element into variable, finally we will get smallest elements.

// To find Largest element from the Array - We will assume that first element is largest and assign it in a variable and then compare each element from array with the variable,
// if any of the element is larger than variable assign that element into variable, finally we will get largest elements.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int min,max;
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
         min=max=arr[0];
        for(int i=1;i<n;++i)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
        System.out.println(max);
        
        
        
    }
}// Author- NAMAN SAINI
