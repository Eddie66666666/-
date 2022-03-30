package interator;

import collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author LiuJun
 * @create 2021-11-26-20:55
 */
public class InteratorTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(false);
        coll.add(new Person("Jason",123));
        coll.add(456);

        Iterator iterator=coll.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
