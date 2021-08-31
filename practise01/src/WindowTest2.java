/**
 *  * 解决线程的安全问题
 *  *
 *  * 方式一：synchronized(同步监视器){
 *  *     //需要被同步的代码
 *  *
 *  * }
 *  * 说明：操作共享数据的代码，即为需要被同步的代码
 *  * 共享数据：多个线程共同操作的变量。比如：ticket
 *  *
 *  * 同步监视器：俗称：锁。
 *
 *
 * @author LiuJun
 * @create 2021-8-26-12:38
 */

class Window2 implements Runnable{
    private int ticket=100;
    Object object=new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 window2=new Window2();

        Thread a=new Thread(window2);
        Thread b=new Thread(window2);
        Thread c=new Thread(window2);

        a.setName("窗口1");
        b.setName("窗口2");
        c.setName("窗口3");

        a.start();
        b.start();
        c.start();

    }






}
