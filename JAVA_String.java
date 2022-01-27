// Paxton has been given strings containing only two letters X and Y. 
// He has to reduce each string such that there are no matching adjacent characters present in the string. For that, he can delete zero or more characters.

// Paxton has to tell how many minimum deletions are required for each string.

// Example

// "XXYYX" can be reduced to "XYX" by deleting X at 0 index and Y at 2 index. Total deletions = 2.

// "YYYY" can be reduced to "Y" by deleting Y at 0,1,2 index. Total deletions = 3.

// Input Format

// A string S as an input.

// Constraints

// 1 <= length of s <= 100000

// Output Format

// Integer that represents count of minimum deletions required.

// Sample Input 0

// XXXY
// Sample Output 0

// 2
// Sample Input 1

// XYXYXY
// Sample Output 1

// 0
// Sample Input 2

// YXXXYX
// Sample Output 2

// 2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}
