package compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LiuJun
 * @create 2021-10-15-23:28
 */
public class CompareTest {

    @Test
    public void test1(){
        String[] arr=new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        String[] arr=new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1=(String)o1;
                    String s2=(String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的不是字符串");
            }
        });
    }
}
