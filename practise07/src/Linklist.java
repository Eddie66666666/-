/**
 * @author LiuJun
 * @create 2022-3-18-15:14
 */
public class Linklist {
    public static void main(String[] args){
        //进行一个测试
        HeroNode a=new HeroNode(1,"宋江","及时雨");
        HeroNode b=new HeroNode(2,"李逵","黑旋风");
        HeroNode c=new HeroNode(3,"吴用","智多星");

        //创建单链表
        singleLinklist l=new singleLinklist();
        l.add(a);
        l.add(b);
        l.add(c);

        l.list();
        System.out.println();
        l.Delete(3);
        l.list();
    }

}
//管理我们的英雄
class singleLinklist{
    //创建头指针
    private HeroNode head=new HeroNode(0,"","");

    //添加新结点
    public void add(HeroNode a){
        HeroNode tmp=head;
        while(true){
            if(tmp.next==null) {
                break;
            }
            tmp=tmp.next;
        }
        tmp.next=a;
    }

    //显示链表
    public void list(){
        //判断链表是否为空
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode tmp=head.next;
        while(true){
            if(tmp==null){
                break;
            }
            System.out.println(tmp);
            tmp=tmp.next;
        }
    }

    //删除一个节点
    public void Delete(int number){
        HeroNode tmp=head;
        boolean flag=false;
        while(tmp!=null){
            if(tmp.next==null){
                System.out.println("链表中没有指定元素");
                break;
            }
            //找到
            if(tmp.next.no==number){
                flag=true;
                break;
            }
            tmp=tmp.next;
        }
        if(flag==true){
            tmp.next=tmp.next.next;
        }
        return;

    }

    public static int getlength(HeroNode head){
        HeroNode tmp=head.next;
        if(tmp==null){
            return 0;
        }
        int length=0;
        while(tmp!=null){
            length++;
            tmp=tmp.next;
        }
        return length;

    }
}

class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    //构造器

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;

    }



    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}