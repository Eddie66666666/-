import java.util.*;

/**
 * @author LiuJun
 * @create 2022-3-20-21:50
 */
public class PolandNotation {
    public static void main(String[] args){
/*        String suffixExpression="3 4 + 5 * 6 - ";

        List<String> rpnList=getListString(suffixExpression);
        //System.out.println("rpnList"+rpnList);
        int res=calculate(rpnList);
        System.out.println(res);*/
        String expression="1+((2+3)*4)-5";
        List<String> infixExpressionList=toInfixExperssionList(expression);
        System.out.println(infixExpressionList);
    }

    public static List<String> getListString(String suffixExpression){
        String[] split=suffixExpression.split(" ");
        List<String> list=new ArrayList<String>();
        for(String ele:split){
            list.add(ele);
        }
        return list;

    }

    //将中缀表达式转换成对应的LiSt
    public static List<String> toInfixExperssionList(String s){
        List<String> ls=new ArrayList<String>();
        int i=0;//一个指针，用于遍历中序表达式字符串
        String str;//对多位数的拼接
        char c;//每遍历一个字符就放入到c中
        do{
            //如果c是一个非数字,需要加入到ls中
            if((c=s.charAt(i))<48 || (c=s.charAt(i))>57){
                ls.add(c+"");
                i++;
            }else{//如果是一个数字,则进行拼接
                str="";//置空
                while(i<s.length() && (c=s.charAt(i))>=48 && (c=s.charAt(i))<=57){
                    str+=c;//拼接
                    i++;
                }
                ls.add(str);
            }
        }while (i<s.length());
        return ls;



    }





    public static int calculate(List<String> ls){

        Stack<String> stack=new Stack<String>();
        //遍历Ls
        for(String item:ls){
            if(item.matches("\\d+")){
                stack.push(item);
            }else{
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                int res=0;
                if(item.equals("+")){
                    res=num1+num2;
                }else if(item.equals("-")){
                    res=num1-num2;
                }else if(item.equals("*")){
                    res=num1*num2;
                }else if(item.equals("/")){
                    res=num1/num2;
                }else{
                    throw new RuntimeException("运算符有误");
                }
                stack.push(res+"");
            }
        }
        return Integer.parseInt(stack.pop());
    }
}


