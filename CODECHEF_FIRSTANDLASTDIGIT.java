
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int [] a=new int[1000];
            int i=0;
            while(n!=0){
                a[i]=n%10;
                n=n/10;
                i++;
            }
            int sum=a[0]+a[i-1];
            System.out.println(sum);
        }
    }
}
