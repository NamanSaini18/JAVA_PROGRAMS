// Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6.  ( Thread Control Mechanism concept)
public class Multithreading extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Exception" + e);
                }
            }
            System.out.println(i);
        }
    }
}
class MyThread{
    public static void main(String[] args) {
        Multithreading obj = new Multithreading();
        obj.start();
    }
}
