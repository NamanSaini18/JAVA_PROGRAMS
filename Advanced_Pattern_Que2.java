import java.util.Scanner;

public class Pattern_Advanced_Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


// O/P:
// 5
//     *****
//    *****
//   *****
//  *****
// *****
