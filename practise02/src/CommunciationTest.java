/**
 * 线程通信的例子：使用两个线程打印1~100的质数
 *
 * 涉及到的三个方法：
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * notify():一旦执行此方法就会唤醒一个被wait的线程，如果有多个被wait就会唤醒优先级高的那个
 * notifyAll():一旦执行此方法，就会唤醒所有被wait的方法
 *
 * 这三个方法必须使用在同步代码块或同步方法中
 * 调用着必须是同步代码或同步方法中的同步监视器
 *
 * @author LiuJun
 * @create 2021-8-26-22:59
 */
class Number implements Runnable{
    private int number=1;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                notify();
            if(number<=100){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+number);
                number++;

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                break;
            }
            }
        }
    }
}

public class CommunciationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1=new Thread(number);
        Thread t2=new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }

}
