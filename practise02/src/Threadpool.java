import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 创建线程的方法四：创建线程池
 *
 * @author LiuJun
 * @create 2021-8-29-21:04
 */

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
class NumberThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
public class Threadpool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new NumberThread());
        executorService.execute(new NumberThread1());
        //关闭连接池
        executorService.shutdown();


    }
}
