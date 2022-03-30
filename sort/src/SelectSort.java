import java.util.Arrays;

/**
 * @author LiuJun
 * @create 2022-3-30-20:46
 */
public class SelectSort {


    public static void main(String[] args){
        int arr[]={1,65,2,54,7,3,41,6,6,3,69,2};
        System.out.println(Arrays.toString(arr));
        Selectsort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void Selectsort(int arr[]){
        int min=arr[0];
        int minIndex=0;
        int tmp = 0;
        for (int j = 0; j < arr.length; j++) {
            min=arr[j];
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex=i;
                }
            }
            if(minIndex!=j){
                arr[minIndex]=arr[j];
                arr[j] = min;

            }

        }

    }
}
