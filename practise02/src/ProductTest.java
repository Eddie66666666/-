/**
 * 线程通信的应用，经典例题：生产者/消费者问题
 *
 *
 * @author LiuJun
 * @create 2021-8-27-13:17
 */
class Clerk{

    private int productCount=0;

    //生产产品
    public synchronized void ProduceProduct(){
        if(productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+productCount);
            notify();

        }
        else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void ConsumeProduct(){
        //等待
        if(productCount>0){
            productCount--;
            System.out.println(Thread.currentThread().getName()+":开始消费第"+productCount);

            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+"开始生产产品");

        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.ProduceProduct();
        }

    }
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+":开始消费产品");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.ConsumeProduct();
        }

    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者");
        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者");

        p1.start();
        c1.start();

    }
}
