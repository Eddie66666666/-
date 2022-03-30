/**
 * @author LiuJun
 * @create 2022-3-18-23:15
 */
public class DoubleLinkListTest {

    public static void main(String[] args){
        HeroNode2 hero1=new HeroNode2(1,"黄白特","Betty");
        HeroNode2 hero2=new HeroNode2(2,"林政男","表舅");
        HeroNode2 hero3=new HeroNode2(3,"刘君","浮躁天狗活着");

        DoubleLinkList list=new DoubleLinkList();
        list.add(hero1);
        list.add(hero2);
        list.add(hero3);
        list.list();
        System.out.println();
        list.Delete(2);
        list.list();
    }


}

//管理双向链表
class DoubleLinkList{
    //创建头指针
    HeroNode2 head=new HeroNode2(0,"","");

    //添加新结点
    public void add(HeroNode2 a){
        HeroNode2 tmp=head;
        while(true){
            if(tmp.next==null) {
                break;
            }
            tmp=tmp.next;
        }
        tmp.next=a;
        a.pre=tmp;
        a.next=null;
    }

    //显示链表
    public void list(){
        //判断链表是否为空
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 tmp=head.next;
        while(true){
            if(tmp==null){
                break;
            }
            System.out.println(tmp);
            tmp=tmp.next;
        }
    }

    //删除一个结点
    public void Delete(int number){
        HeroNode2 tmp=head;
        boolean flag=false;
        while(tmp!=null){
            if(tmp.next==null){
                System.out.println("链表中没有指定元素");
                break;
            }
            //找到
            if(tmp.no==number){
                flag=true;
                break;
            }
            tmp=tmp.next;
        }
        if(flag==true){
            tmp.next.pre=tmp.pre;
            if(tmp.next!=null){
                tmp.pre.next=tmp.next;
            }
        }
        return;

    }
}

//英雄结点
class HeroNode2{
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;
    public HeroNode2 pre;

    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

}