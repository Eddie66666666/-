/**
 * 测试Thread中的常用方法
 * 1.start()方法,调用当前线程的run()方法
 * 2.run():通常需要重写Thread类中的此方法,将创建的线程执行的操作声明在此方法中
 * 3.currentThread():返回当前代码执行的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():线程释放当前cpu的执行权
 * 7.join():此时线程a进入阻塞状态,直到线程b完全执行完后，线程a才结束阻塞状态
 * 8.stop():已过时，强制结束当前线程
 * 9.sleep(long millitime):让当前线程睡眠指定的时间，在时间内线程是阻塞状态
 * 10.isAlive():判断当前线程是否存活
 *
 * 线程的优先级：
 * 1.
 * MAX_PRIORITY:10
 * MIN_PRIORITY:1
 * NORM_PRIORITY:5  默认优先级
 * 2.如何来获取和设置当前线程的优先级
 * getpriority():获取
 * setpriority():设置
 *
 * 设置后高优先级的只是高概率被执行，并不意味着只有高优先级被执行完了再执行低优先级
 *
 *
 * @author LiuJun
 * @create 2021-8-25-13:10
 */

class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

            if(i%20==0) {
                this.yield();
            }
        }
    }

    public HelloThread(String name){
        super(name);
    }

}
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1=new HelloThread("Thread:1");
        h1.setName("线程1");
        h1.start();

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);

        //给主线程命名
        Thread.currentThread().setName("主线程");

        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

            if(i == 20){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(h1.isAlive());
    }
}
