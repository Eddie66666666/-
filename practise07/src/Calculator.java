

/**
 * @author LiuJun
 * @create 2022-3-20-20:01
 */
public class Calculator {
    public static void main(String[] args){
        String expression="3+2*6-2";
        ArrayStack numStack=new ArrayStack(10);
        ArrayStack operStack=new ArrayStack(10);

        int index=0;//用于扫描
        int num1=0;
        int num2=0;
        int oper=0;
        int res=0;
        String keepnum="";//用于拼接多位数
        char ch=' ';//将每次扫描到的char保存到ch
        //开始循环
        while(true){
            int count=0;
            ch=expression.charAt(count);
            //判断ch是什么进行相应的处理
            if(operStack.isOper(ch)){//如果是一个字符
                if(operStack.isEmpty()){
                    //若为空直接入栈
                    operStack.push(ch);
                }else{
                    //与栈内已有符号进行比较
                    if(operStack.priority(ch)<=operStack.priority(operStack.getTop())){
                        num1=numStack.pop();
                        num2=numStack.pop();
                        oper=operStack.pop();
                        res=numStack.cal(num1,num2,oper);//计算结果
                        numStack.push(res);//结果压入栈中
                    }else{
                        operStack.push(ch);
                    }

                }

            }else{//输入的字符为数字
                keepnum+=ch;
                if(count==expression.length()-1){
                    numStack.push(Integer.parseInt(keepnum));
                }
                else{
                    if(operStack.isOper(expression.charAt(count+1))){
                        numStack.push(Integer.parseInt(keepnum));
                        keepnum="";//清空
                    }
                }
            }
            index++;
            if(index>=expression.length()){
                break;
            }
        }
        //计算式输入完毕
        while (true) {
            if(operStack.isEmpty()){
                break;
            }
            num1=numStack.pop();
            num2=numStack.pop();
            oper=operStack.pop();
            res=numStack.cal(num1,num2,oper);//计算结果
            numStack.push(res);//结果压入栈中

        }
        System.out.println(res);
    }

}

class ArrayStack{
    private int maxSize;//栈的大小
    private int[] stack;//数组
    private int top=-1;//top表示栈顶

    //构造器
    public ArrayStack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
    }

    //返回栈顶元素
    public int getTop(){
        return stack[top];
    }

    //栈满
    public boolean isFull(){
        return top==maxSize-1;
    }

    //栈空
    public boolean isEmpty(){
        return top==-1;
    }

    //入栈
    public void push(int number){
        if(isFull()){
            System.out.println("栈已满，无法入栈");
            return;
        }
        top++;
        stack[top]=number;

    }

    //出栈
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈已空，无法出栈");
        }
        int value=stack[top];
        top--;
        return value;
    }

    //遍历栈
    public void print(){
        if(isEmpty()){
            System.out.println("栈空，没有数据");
            return;
        }
        for (int i = top; i >=0 ; i--) {
            System.out.println(stack[i]);
        }
    }

    //判断运算符的优先级
    public int priority(int oper){
        if(oper=='*' || oper=='/'){
            return 1;
        }else if(oper=='+' || oper=='-'){
            return 0;
        }else{
            return -1;
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val){
        return val=='+' || val=='-' || val=='*' || val=='/';
    }

    //计算方法
    public int cal(int num1,int num2,int oper){
        int res=0;
        switch(oper){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num2-num1;
            case '*':
                res=num1*num2;
                break;
            case '/':
                res=num2/num1;
                break;
            default:
                break;
        }
        return res;
    }

}
