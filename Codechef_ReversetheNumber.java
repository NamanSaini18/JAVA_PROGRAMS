import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   
	   for(int i=1; i<=n; i++){
	        int num = scan.nextInt();
	        int reverse = 0;
	        
	        while(num>0){
	             int rem = num%10;
	             reverse = reverse*10 + rem;
	             num = num/10;
	            }
	            System.out.println(reverse);
	   }
	}
}
