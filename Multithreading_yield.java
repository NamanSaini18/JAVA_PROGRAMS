public class MyThread99 extends Thread{
    public void run(){
        for(int i = 0;i<5;++i){
            Thread.yield();
            System.out.println("Thread started" + Thread.currentThread().getName());

        }
        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }
}
class YieldMethodTest{
    public static void main(String[] args) {
        MyThread99 thread = new MyThread99();
        thread.start();
        for(int i=0;i<5; ++i){
            System.out.println("Thread Started:" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }
}
