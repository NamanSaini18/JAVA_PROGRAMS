// This is the code for printing Palindromic pattern of numbers.
import java.util.Scanner;

public class Palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// O/P:
// 5(Input for no of rows)
  
//     1
//    212
//   32123
//  4321234
// 543212345
