// Given an array of n integers, The task is to find another integer x .such that,
// if all the elements of the array are subtracted individually from the number x, then the sum of all the differences should add to 0. 
// If any such integer exists, print the value of x, else print -1.

// The idea is to calculate the total sum of the array and divide it by the size of the array. 
// If the sum of the array is perfectly divisible by its size then the quotient obtained from this division operation will be the required hidden number.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        int x = sum/n;
        if(x*n==sum)
        {
            System.out.println(x);
        }
        else
            System.out.println("-1");
        
    }
}
