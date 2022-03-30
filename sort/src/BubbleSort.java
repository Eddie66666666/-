/**
 * @author LiuJun
 * @create 2022-3-30-20:07
 */
public class BubbleSort {

    public static void Bubblesort(int arr[]){
        int tmp=0;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            flag=false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }

            }
            if(flag==false){
                break;
            }
        }

    }


    public static void main(String[] args){
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*10);
        }
        Bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
