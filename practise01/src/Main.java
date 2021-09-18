import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2021-9-18-14:53
 */
public class Main {
    int max(int a,int b){
        int max=0;
        if(a>b){
            max=a;
        }else {
            max = b;
        }

        return max;
    }
    int min(int a,int b){
        int min=0;
        if(a<b){
            min=a;
        }else{
            min=b;
        }
        return min;
    }

    boolean average(int[][] score,int i,int j,int k,int t,int length){
        int a=max(0,i-k);
        int b=max(j-k,0);
        int c=min(i+k,length);
        int d=min(j+k,length);
        int number=(c-a+1)*(d-b+1);
        int sum=0;
        for(int n1=a;a<=c;a++){
            for(int n2=b;b<=d;b++){
                sum+=score[n1][n2];
            }
        }
        double average=sum/number;
        if(average>=t){
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
