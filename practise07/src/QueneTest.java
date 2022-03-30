import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2022--18-14:16
 */
public class QueneTest {

    public static void main(String[] args){
        ArrayQuene quene=new ArrayQuene(10);
        char key=' ';//接收用户输入
        Scanner in=new Scanner(System.in);
        boolean loop=true;
        while(loop){
            key=in.next().charAt(0);//接收字符串的第一个字符
            switch(key){
                case 's':
                    quene.show();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value=in.nextInt();
                    quene.add(value);
                case 'g'://取出数据
                    try {
                        int res=quene.push();
                        System.out.println("res");
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 'e'://退出
                    in.close();
                    loop=false;
                    break;
                default:
                    break;
            }
        }



    }

}

//使用数组模拟一个队列
class ArrayQuene{
    private int Maxsize;
    private int front;
    private int rear;
    private int[] arr;

    //创建队列的构造器
    public ArrayQuene(int arrMaxsize){
        Maxsize=arrMaxsize;
        arr=new int[arrMaxsize];
        front=rear=-1;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }

    public boolean isFull(){
        return rear==Maxsize-1;
    }

    //添加数据到新的队列
    public void add(int number){
        if(isFull()){
            System.out.println("队列已满，无法继续添加");
            return;
        }
        rear++;//让rear后移
        arr[rear]=number;
    }

    //出队列
    public int push(){
        if(isEmpty()){
            throw new RuntimeException("队列空，不能出队列");
        }
        front++;
        return arr[front];
    }

    public void show(){
        ;
    }
}