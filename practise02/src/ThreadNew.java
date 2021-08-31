import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author LiuJun
 * @create 2021-8-29-20:16
 */

class NumThread implements Callable{
    int sum=0;
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            Object sum=futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
