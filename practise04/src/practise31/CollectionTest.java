package practise31;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author LiuJun
 * @create 2021-10-31-13:19
 *
 *
 *
 */

public class CollectionTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();

        //add(Object e)
        coll.add("AA");
        coll.add("BB");
        coll.add("CC");
        coll.add("DD");
        coll.add(new Date());

        //size()获取元素的个数
        System.out.println(coll.size());

        Collection coll1=new ArrayList();
        coll1.add("awdads");
        coll1.add("wdads");
        coll.add(coll1);

        System.out.println(coll.size());
        System.out.println(coll);
    }
}
