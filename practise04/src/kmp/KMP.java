package kmp;

/**
 * @author LiuJun
 * @create 2021-10-08-14:01
 */
public class KMP {
    /**
     *
     * @param str 主串
     * @param sub 子串
     * @param pos 位置
     * @return
     */
    public static int KMP(String str,String sub,int pos){
        if(str==null || sub==null){
            return -1;
        }
        int strlen=str.length();
        int sublen=sub.length();
        if(strlen==0 || sublen==0){
            return -1;
        }
        if(pos<0 || pos>=sublen){
            return -1;
        }
        int[] next=new int[sublen];
        getNext(sub,next);
        int i=pos;//遍历主串
        int j=0;//遍历子串

        while(i<strlen && j<sublen){
            if(j==-1 || str.charAt(i)==sub.charAt(j)){
                i++;
                j++;
            }else{
                j=next[j];
            }
        }
        if(i>=sublen){
            return i-j;
        }else{
            return -1;
        }
    }

    public static void getNext(String sub,int[] next){
        next[0]=-1;
        next[1]=0;
        int i=2;
        int k=0;
        //遍历子串
        for(;i<sub.length();i++){
            if(k==-1 || sub.charAt(i-1)==sub.charAt(k)){
                next[i]=k+1;
                k++;
                i++;
            }else{
                k=next[k];
            }
        }

    }

    public static void main(String args[]){
        int pos=0;
        System.out.println(KMP("ababcabcdabcdeabcdef","abcd",pos=0));
    }
}
