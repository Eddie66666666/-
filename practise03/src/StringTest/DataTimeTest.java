package StringTest;

import org.junit.Test;

import java.util.Date;

/**
 * @author LiuJun
 * @create 2021-9-03-13:46
 */
public class DataTimeTest {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        Date date=new Date();
        System.out.println(date.toString());

    }
}
