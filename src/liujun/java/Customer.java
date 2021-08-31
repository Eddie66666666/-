package liujun.java;

import java.util.HashMap;

/**
 * @author LiuJun
 * @create 2021-8-22-10:08
 */
public class Customer {
    String name;
    int age;

    public void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.print();
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String age=map.get("age");

    }
}
