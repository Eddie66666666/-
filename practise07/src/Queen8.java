/**
 * @author LiuJun
 * @create 2022-3-30-9:06
 */
public class Queen8 {
    int max=8;
    int[] array=new int[max];
    static int count=0;

    public static void main(String[] args){
        Queen8 queen8=new Queen8();
        queen8.check(0);
        System.out.println("一共有"+count+"种");

    }

    private void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        count++;
    }


    private void check(int n){
        if(n==max){
            print();
            return;
        }
        //依次输入皇后，并判断是否冲突
        for (int i = 0; i < max; i++) {
            array[n]=i;
            if(judge(n)){//不冲突
                //接着放n+1个皇后，开始递归
                check(n+1);
            }
            //如果冲突，则继续执行array[n]=i,即将第n个皇后放置在本行的后移一个位置
        }
    }
    /**
     * 查看当我们放置第n个皇后时，有没有与前面的皇后冲突
     * @param n
     * @return 返回是否冲突
     */
    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
            if(array[i]==array[n] || Math.abs(n-i)==Math.abs(array[n]-array[i]))
                return false;
        }
        return true;
    }

}
