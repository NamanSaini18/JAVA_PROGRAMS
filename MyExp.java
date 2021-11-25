import java.util.Scanner;

public class MyExp {
    public void m1() throws ArithmeticException{
        m2();


    }
    public void m2() throws ArithmeticException{
        System.out.println(10/0);

    }
    public static void main(String[] args) throws ArithmeticException {
        MyExp obj = new MyExp();
        try {
            obj.m1();
        }
        catch (ArithmeticException obj1){
            System.out.println(obj);
        }
        obj.m1();
        System.out.println("end of the main method");
// Here exception is handled by the default exception handling mechanism
//        // try with resources
//
//
//        try(Scanner sc = new Scanner(System.in)){
//            int i = Integer.parseInt(sc.next());
//        }
//        catch(Exception obj){
//            obj.printStackTrace();
//
//            System.out.println(obj.toString());
//            System.out.println(obj.getMessage());
//            System.out.println(obj);
//        }
//        System.out.println("end of the method");

    }
}
