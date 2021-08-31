import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 解决线程安全的方式三 ：Lock锁
 * @author LiuJun
 * @create 2021-8-26-20:47
 */

class window implements Runnable{
    private int ticket=100;
    //1.实例化ReentrantLock
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                //2.调用lock()
                lock.lock();
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"售票: 票号为"+ticket);
                ticket--;
            }else
            {
                break;
            }}finally {
                //3.调用解锁方法
                lock.unlock();
            }

        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        window w1=new window();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口一");
        t1.setName("窗口二");
        t1.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }

}
