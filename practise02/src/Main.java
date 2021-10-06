import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2021-9-19-9:46
 */



public class Main {



    public static void main(String args[]){
        int n,k,t,xl,yd,xr,yu=0;
        Scanner in=new Scanner(System.in);
        //读入数据
        n=in.nextInt();
        k=in.nextInt();
        t=in.nextInt();
        xl=in.nextInt();
        yd=in.nextInt();
        xr=in.nextInt();
        yu=in.nextInt();
        int[][] number=new int[n][2*t];
        boolean ifStay;
        boolean ifIn;
        int tmpcount;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*t;j++){
                number[i][j]=in.nextInt();
            }
        }
        //进行遍历判断
        for(int i=0;i<n;i++){
            ifStay=false;
            ifIn=false;
            tmpcount=0;
            for(int j=0;j<2*t;j+=2) {

                if (xl <= number[i][j] && number[i][j] <= xr && yd <= number[i][j + 1] && number[i][j + 1] <= yu) {
                    tmpcount++;
                    ifIn = true;
                    if (tmpcount >= k) {
                        ifStay = true;

                        count2++;
                        break;
                    }
                }else{
                    tmpcount=0;
                }

            }
            if(ifIn==true){
                count1++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }

}
