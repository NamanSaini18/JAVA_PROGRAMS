import com.sun.source.tree.SynchronizedTree;

class Account{
    public int balance;
    public Account(){
        balance=10000;
    }
    public void withDraw(int val) throws InterruptedException {
        synchronized (this){
            Thread.sleep(1000);
            balance=balance-val;
            System.out.println(balance);
        }
    }
}
class Mythread88 extends Thread{
    Account obj;
    Mythread88(Account tobj){
        obj=tobj;
    }
    public void run(){
        try {
            obj.withDraw(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




public class Test99 {
    public static void main(String[] args) {
        Account obj = new Account();
        Mythread88 t1 = new Mythread88(obj);
        Mythread88 t2 = new Mythread88(obj);
        t1.start();
        t2.start();

    }
}
