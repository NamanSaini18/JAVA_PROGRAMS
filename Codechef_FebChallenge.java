// Chef, being a Chess fan, was thrilled after he read the following news:

// Michael Simkin, a postdoctoral fellow at Harvard University’s Center of Mathematical Sciences and Applications proved that for a large value of N, there are approximately (0.143⋅N)N configurations in which N queens can be placed on a N×N chessboard so that none attack each other.

// Although the formula is valid for large N, Chef is interested in finding the value of function f(N) = (0.143⋅N)N for a given small value of N. Since Chef is busy understanding the proof of the formula, please help him calculate this value.

// Print the answer rounded to the nearest integer. That is, if the actual value of f(N) is x,

// Print ⌊x⌋ if x−⌊x⌋<0.5
// Otherwise, print ⌊x⌋+1
// where ⌊x⌋ denotes the floor of x.

// Input Format
// The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
// Each test case consists of a single line of input containing one integer N.
// Output Format
// For each test case, output in a single line the value of f(N) rounded to the nearest integer.

// Constraints
// 1≤T≤12
// 4≤N≤15
// Subtasks
// Subtask #1 (100 points): Original constraints

// Sample Input 1 
// 2
// 4
// 10
// Sample Output 1 
// 0
// 36
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- != 0){
		    int N = sc.nextInt();
		    double p = 0.143 * N;
		    double f_N = Math.pow(p,N);
		    double result = Math.round(f_N);
		    System.out.println((int)result);
		}
		sc.close();
	}
}
