import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String target = "naman@gmail.com";
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|yahoo|rediff)[.]com");
        Matcher m = p.matcher(target);
        int count = 0;
        while(m.find()){
            System.out.println(m.start()+ "--"+ m.end()+ "--"+m.group());
            count++;
        }
        System.out.println(count);

    }
}
