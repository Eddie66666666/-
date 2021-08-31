package day01;


import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2021-8-31-20:24
 */
public class Main {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int number1=in.nextInt();
            int number2=in.nextInt();
            int number3=in.nextInt();
            int[] a=new int[number3];
            int number=0;
            for(int i=0;i<number1;i++){
                for(int j=0;j<number2;j++){
                    number=in.nextInt();
                    a[number]++;
                }
            }
            for(int t=0;t<number3;t++){
                System.out.print(a[t]);
                System.out.print(" ");
            }
//            new String();
            in.close();
        }

}
