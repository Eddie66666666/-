/**
 * 例子：创建三个窗口类型，总票数为100张
 *
 * 存在线程的安全问题：待解决
 *
 * 解决线程的安全问题
 *
 *关于同步方法的总结：
 * 2.同步方法仍然涉及同步监视器，只是不需要我们显示的声明
 * 非静态的同步方法，同步监视器是this
 * 静态的同步方法，同步监视器是当前类本身
 *
 * @author LiuJun
 * @create 2021-8-25-15:22
 */

class Window extends Thread{
    private static int ticket=100;
    private static Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(getName() + ":卖票 票号为" + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
            }
        }
    }

    private synchronized void mathod(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + ":卖票 票号为" + ticket);
            ticket--;
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1=new Window();
        Window w2=new Window();
        Window w3=new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }


}
