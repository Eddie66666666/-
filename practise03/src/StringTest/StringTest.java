package StringTest;

import org.junit.Test;

import java.util.Arrays;

/**
 * String的使用
 *
 * @author LiuJun
 * @create 2021-8-30-13:17
 */
public class StringTest {
    /*
    String:使用一对“”来表示
    1.String是声明为final的，不可被继承
    2.String实现了Serivalable接口，表示字符串支持序列化
    3.String内部定义了final char【】 value用于存储字符串数据
    4.String代表不可变得字符串序列


     */
    @Test
    public void test1(){
        String s1="hello";
        String s2="Hello";
        String s3="abc";
        String s4=s3.concat("def");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s4);
    }

    @Test
    public void test2(){
        int num=123;
        String s1="123";
        String s2=num+"";
        int number=Integer.parseInt(s1);
        String s3=String.valueOf(num);
        System.out.println(
                num + s1 +s2 +s3
        );
    }

    @Test
    public void test3(){
        String s1="ufghishfo";
        byte[] a=s1.getBytes();
//        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));

    }
}
