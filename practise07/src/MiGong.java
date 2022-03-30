/**
 * @author LiuJun
 * @create 2022-3-21-9:41
 */
public class MiGong {
    public static void main(String[] args){
        //创建迷宫
        int[][] map=new int[8][7];
        //使用1表示墙
        //上下全部置为1
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }

        //左右全部置为1
        for(int j=0;j<8;j++){
            map[j][0]=1;
            map[j][6]=1;
        }

        map[3][1]=1;
        map[3][2]=1;

        //输出地图
        System.out.println("输出地图");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        setWay(map,1,1);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }


    }

    public static boolean setWay(int[][] map,int i,int j){
        if(map[6][5]==2){//通路已经找到
            return true;
        }else{
            if(map[i][j]==0){//假定可以走通
                map[i][j]=2;//假定可以走通
                if (setWay(map, i + 1, j)) {//向下走
                    return true;
                }else if(setWay(map,i,j+1)){//向右走
                    return true;
                }else if (setWay(map, i - 1, j)) {//向上走
                    return true;
                }else if(setWay(map,i,j-1)){//向左走
                    return true;
                }else{
                    map[i][j]=3;//走不通
                    return false;
                }
            }else{//等于1 3 (走不通)
                return false;
            }
        }
    }
}
