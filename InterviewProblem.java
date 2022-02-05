// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// Input Format

// n1 & n2 (represents the size of arrays, arr1 and arr2)
// User inputs in arr1 and arr2
// Constraints

// arr1.length == x
// arr2.length == y
// 0 <= x <= 1000
// 0 <= y <= 1000
// z <= x + y <= 2000
// Output Format

// Input: n1 = 2, n2 = 2, arr1 = [5,6], arr2 = [7,8]
// Output: 6.5
// Explanation: merged array = [5,6,7,8] and median is (6 + 7) / 2 = 6.5.
// Sample Input 0

// 2
// 1
// 1 3
// 2
// Sample Output 0

// 2.0
import java.io.*;
import java.util.*;

public class Solution {

            public static double medianofarray(int nums1[],int nums2[]){
                double median;
                int j=0;
                int [] num = new int[nums1.length + nums2.length];
                for(int i=0;i<num.length;i++){
                    if(i<nums1.length){
                        num[i] = nums1[i];
                    }
                    else if(j<nums2.length){
                            num[i] = nums2[j];
                            j++;
                    }
                }
                Arrays.sort(num);
                if(num.length%2==0){
                    int k = num.length/2-1;
                    int m = k+1;
                    double sum= (num[k]+num[m]);
                    median = sum/2;
                }
                else{
                    int k = num.length/2;
                    median = num[k];
                }
                return median;
// SECOND LOGIC             
//             int i=0,int j=0,int count =0;
//             int mid1=0,int mid2 = 0;
//             while(count<=med){
//                 if(arr1[i]<=arr2[j]){
//                     mid1 = mid2;
//                     mid1 = arr1[i];
//                     i=i+1;
                    
//                 }
//                 else{
//                     mid1 = mid2;
//                     mid2 = arr2[j];
//                     j=j+1;
//                 }
//                 if(i==n){
//                     mid1 = mid2;
//                     mid2 = arr2[0];
//                     break;
//                 }
//                 else if(j==n){
//                     mid1 = mid2;
//                     mid2 = arr1[0];
//                     break;
//                 }
//                 count++;
//             }
//             return (double)(mid1 + mid2)/2
            
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(medianofarray(arr1,arr2));

    }
}
