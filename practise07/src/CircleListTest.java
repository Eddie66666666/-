/**
 * @author LiuJun
 * @create 2022-3-20-10:41
 */
public class CircleListTest {
    public static void main(String[] args){
        CircleLinklist list=new CircleLinklist();
        list.add(5);
       //list.print();
        list.count(2);

    }

}

class Node{
    public int number;
    public Node next;

    public Node(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class CircleLinklist{
    //创建头结点
    Node head=new Node(1);
    //当前结点
    Node cur=head;
    Node pre=null;//当前结点的前一个结点

    public void add(int num){
        if(num<1){
            System.out.println("输入错误");
            return;
        }
        if(num==1){
            return;
        }
        for (int i = 1; i < num; i++) {
            Node tmp=new Node(i+1);
            //链接下一个节点
            cur.setNext(tmp);
            tmp.setNext(head);
            cur=tmp;
        }
        //移动回cur指针
        cur=head;
    }

    //遍历环形链表
    public void print(){
        Node tmp=head;
        while(true){
            System.out.println(tmp.getNumber());
            if(tmp.getNext()==head){
                break;
            }
            tmp=tmp.getNext();
        }
    }

    //数小孩
    public void count(int count){
        while(cur.getNext()!=head){
            cur=cur.getNext();
        }
        while(true){
            //移动到指定位置(一次操作)
            for(int i=count;i>0;i--){
                pre=cur;
                cur=cur.getNext();
            }
            System.out.println(cur.getNumber());//输出数字
            pre.setNext(cur.getNext());
            if(pre.getNext()==pre){
                System.out.println(pre.getNumber());
                break;
            }
            cur=pre;
            pre=null;

        }


    }
}
