package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * collection接口中声明的常用方法的测试
 *
 * 向Collection接口实现类的对象中添加数据obj时，要求obj的对象需要重写equals()方法
 *
 * @author LiuJun
 * @create 2021-11-19-15:00
 *
 *
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(false);
        coll.add(new Person("Jason",123));
        coll.add(456);


        //contains(Object obj)方法
        boolean contains=coll.contains(123);
        System.out.println(contains);

        Collection coll2= Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll2));

        //集合->数组
        Object[] arr=coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //数组->集合 调用Array类的静态方法aslist()
        List<String> strings = Arrays.asList(new String[]{"AA","BB","CC"});


    }

}
