// You are given a binary string S and an integer K. In one operation, you can pick any bit and flip it, i.e turn 0 to 1 or 1 to 0. Can you make the string S a palindrome using exactly K operations?

// Print YES if this is possible, and NO if it is not.

// Input Format
// The first line of input contains one integer T, denoting the number of test cases. The description of T test cases follows.
// Each test case consists of two lines of input.
// The first line of each test case contains two space-separated integers N and K, denoting the length of the binary string and the number of operations to be performed.
// The second line contains the binary string S.
// Output Format
// For each test case, print the answer on a new line — YES if the S can be made a palindrome using exactly K operations, and NO otherwise.

// You may print each character of YES and NO in either uppercase or lowercase (for example, yes, yEs, Yes will all be considered identical).

// Constraints
// 1≤T≤1000
// 1≤N≤1000
// 0≤K≤N
// S is a binary string, i.e, contains only characters 0 and 1
// Subtasks
// Subtask #1 (100 points): Original constraints

// Sample Input 1 
// 2
// 3 0
// 110
// 6 1
// 101100
// Sample Output 1 
// NO
// YES
import java.util.*;
import java.lang.*;
import java.io.*;

// This code is written by me. Happy to Help!, But please don't copy this!!!!
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();  // taking input of number of test cases
		while(T-- != 0){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    sc.nextLine();
		    String S = sc.nextLine();
		    int count = forPalindrome(S);
		    if(count <= K){
		        if(S.length() % 2 == 1){
		            System.out.println("Yes");
		        }
		        else{
		            if((K - forPalindrome(S)) % 2 == 0){
		                System.out.println("Yes");
		            }
		            else{
		                System.out.println("NO");
		            }
		        }
		    }
		    else{
		        System.out.println("NO");
		    }
		 }
		    sc.close();
		}
		private static int forPalindrome(String S){
		    int left = 0;
		    int right = S.length()-1;
		    int count = 0;
		    while(left<right){
		        if (S.charAt(left) != S.charAt(right)) {
		            count++;
		        }
		        left++;
		        right--;
		    }
		    return count;
	}
}
