import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2021-9-18-14:53
 */
public class Main {

    boolean average(int[][] score,int i,int j,int k,int t,int length){
        int a=Math.max(0,i-k);
        int b=Math.max(j-k,0);
        int c=Math.min(i+k,length-1);
        int d=Math.min(j+k,length-1);
//        System.out.println("a"+a);
//        System.out.println("b"+b);
//        System.out.println("c"+c);
//        System.out.println("d"+d);
        double number=(c-a+1)*(d-b+1);
        double sum=0.0;
        for(int n1=a;n1<=c;n1++){
            for(int n2=b;n2<=d;n2++){
//                System.out.println("数据"+score[n1][n2]);
                sum+=score[n1][n2];
            }
        }
//        System.out.println(sum);
//        System.out.println(number);
        double average=sum/number;
//        System.out.println("平均数"+average);
        if(average<=t){
            return true;
        }else{
            return false;

        }
    }

    public static void main(String args[]){
        Main a=new Main();
        Scanner in=new Scanner(System.in);
        int n,L,r,t=0;
        n=in.nextInt();//边长
        L=in.nextInt();//数据范围
        r=in.nextInt();//数据边框
        t=in.nextInt();//平均数
        int[][] score=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                score[i][j]=in.nextInt();
            }
        }
//        for (int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(score[i][j]);
//            }
//        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a.average(score,i,j,r,t,n)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
