import java.util.Scanner;

/**
 * @author LiuJun
 * @create 2021-9-19-8:56
 */


class point{
    int number;
    double instance;
    public point(int i,double instance){
        this.number=i;
        this.instance=instance;
    }
}

public class Instance {

    double instance(int X,int xi,int Y,int yi){
        double instance=(X-xi)*(X-xi)+(Y-yi)*(Y-yi);
        return instance;
    }

    public static void main(String args[]){
        int n,X,Y=0;
        Instance a=new Instance();
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        X=in.nextInt();
        Y=in.nextInt();
        point[] instance=new point[n];
        for(int i=0;i<n;i++){
            instance[i]=new point(0,0.0);
        }
        for(int i=0;i<n;i++) {
            int xi=in.nextInt();
            int yi=in.nextInt();
            instance[i].number=i+1;
            instance[i].instance=a.instance(X,xi,Y,yi);
        }
        //进行排序
        for(int i=0;i<instance.length;i++){
            for(int j=0;j<instance.length-i-1;j++){
                if(instance[j].instance>instance[j+1].instance){
                    point tmp=instance[j];
                    instance[j]=instance[j+1];
                    instance[j+1]=tmp;
                }

            }
        }
        for(int i=0;i<3;i++){
            System.out.println(instance[i].number);
        }

    }

}
