/**
 * 多线程的创建：
 * 方式一：继承于thread类
 * 1.创建一个继承于thread的子类
 * 2.重写thread中的run（）方法
 * 3.创建thread类的子类的对象
 * 4.通过此对象调用start()方法
 *
 * 例子：遍历100以内的所有偶数
 *
 * @author LiuJun
 * @create 2021-8-23-20:29
 */

//1.创建一个继承自thread的子类
class MyThread extends Thread{

    public void run(){
        for (int i = 0; i < 100;i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

    }
}
