
/**
 * @author LiuJun
 * @create 2022-3-18-13:16
 */
public class SpraseArray {

    public static void main(String[] args){

        int chessArr[][]=new int[11][11];
        chessArr[1][2]=1;
        chessArr[2][3]=2;
        //输出原始的二维数组
        System.out.println("原始的二维数组");
        for(int[] row:chessArr){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //遍历二维数组得到非零的个数
        int sum=0;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.printf("非零的个数为%d",sum);
        System.out.println();
        //创建稀疏数组
        int sparseArray[][]=new int[sum+1][3];
        sparseArray[0][0]=11;
        sparseArray[0][1]=11;
        sparseArray[0][2]=sum;
        int count=1;
        for(int i=0;i<11;i++){
            for (int j = 0; j < 11; j++) {
                if(chessArr[i][j]!=0){
                    sparseArray[count][0]=i;
                    sparseArray[count][1]=j;
                    sparseArray[count][2]=chessArr[i][j];
                    count++;

                }
            }
        }

        //输出稀疏数组
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
            System.out.println();


        }


        //将稀疏数组转换成二维数组
        int chess2Array[][]=new int[sparseArray[0][0]][sparseArray[0][1]];
        //放入数据
        for (int i = 2; i < sparseArray.length; i++) {
            chess2Array[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }

    }
}
