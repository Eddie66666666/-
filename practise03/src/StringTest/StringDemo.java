package StringTest;

import org.junit.Test;

/**
 * 关于字符串算法的研究
 * @author LiuJun
 * @create 2021-9-04-22:26
 */

public class StringDemo {

    public String reverse(String str,int startindex,int endindex){
        if(str!=null){
            char[] arr=str.toCharArray();
            for(int x=startindex,y=endindex;x<y;x++,y--){
                char tmp=arr[x];
                arr[x]=arr[y];
                arr[y]=tmp;
            }
            return new String(arr);
        }
        return null;
    }
    public String reverse1(String str,int startindex,int endindex){
        StringBuilder builder =new StringBuilder(str.length());
        builder.append(str.substring(0,startindex));

        for(int i=endindex;i>startindex;i--){
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endindex+1));
        return builder.toString();
    }
    @Test
    public void test(){
        String str="abcdef";
        String str1=reverse(str,2,5);
        System.out.println(str1);

    }

}
