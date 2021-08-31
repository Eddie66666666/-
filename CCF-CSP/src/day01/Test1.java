package day01;

import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2021-8-31-19:32
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int number1=0;
        int number2=0;
        int sum=0;
        for(int i=0;i<number;i++){
            number1=in.nextInt();
            number2=in.nextInt();
            sum+=number1*number2;
        }
        if(sum>0)
        {
            System.out.println(sum);
        }else{
            System.out.println(0);
        }
    }
}
