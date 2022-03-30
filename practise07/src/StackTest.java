import java.util.Stack;

/**
 * @author LiuJun
 * @create 2022-3-18-22:26
 */
public class StackTest {

    public static void main(String[] args){
        Stack<String> stack=new Stack();
        stack.add("jack");
        String a=stack.pop();
        System.out.println(a);


    }

    public static void ReversePrint(HeroNode head){
        if(head.next==null || head==null){
            return;
        }
        //创建一个栈，将各个结点入栈
        Stack<HeroNode> stack=new Stack<HeroNode>();
        HeroNode p=head.next;//接收头指针
        while(true){
            if(p==null){
                break;
            }
            stack.push(p);
            p=p.next;
        }
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
