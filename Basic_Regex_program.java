import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, Please enter your email ID for the registration");
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|yahoo|rediff)[.]com");
        Matcher m = p.matcher(str);
        int ctr = 0;
        while(m.find()){
            System.out.println(m.start()+ "--"+ m.end()+ "--"+m.group());
            ctr++;
        }
        if(ctr==0){
            System.out.println("Invalid Input, Please enter the valid format");
        }
        else {
            System.out.println("Congratulations,You are registered successfully!");
            System.out.println(ctr);
        }

    }
}
