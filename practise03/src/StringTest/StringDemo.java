//package StringTest;
//
//import org.junit.Test;
//
///**
// * 关于字符串算法的研究
// * @author LiuJun
// * @create 2021-9-04-22:26
// */
//
//public class StringDemo {
//    public String reverse(String str,int Startindex,int Endindex){
//         char[] a=str.toCharArray();
//         for(int x=Startindex,y=Endindex;x<y; x++,y-- ){
//             char tmp=a[x];
//             a[x]=a[y];
//             a[y]=tmp;
//         }
//         return new String(a);
//    }
////使用Stringbuilder替换String
//    public String reverse2(String str,int Startindex,int Endindex){
//        StringBuffer string=new StringBuffer(str);
//
//        string.append(str.substring(0,Startindex));
//        for(int i=Endindex;i>Startindex;i--){
//            string.append(str.charAt(i));
//        }
//
//        string.append(str.substring(Endindex+1);
//
//        return string.toString();
//    }
//
////    public String reverse1(String str,int startindex,int endindex){
////        StringBuilder builder =new StringBuilder(str.length());
////        builder.append(str.substring(0,startindex));
////
////        for(int i=endindex;i>startindex;i--){
////            builder.append(str.charAt(i));
////        }
////        builder.append(str.substring(endindex+1));
////        return builder.toString();
////    }
//    @Test
//    public void test(){
//        String str="abcdef";
//        String str1=reverse(str,2,5);
//        System.out.println(str1);
//
//    }
//    public String getsameString(String str1,String str2){
//        if(str1!=null && str2!=null){
//            String maxstr=(str1.length()>str2.length())?str1:str2;
//            String minstr=(str1.length()>str2.length())?str1:str2;
//
//            int length=minstr.length();
//
//            for(int i=0;i<length;i++){
//                for(int x=0,y=length-1;y<=length;x++,y++){
//                    String substr=minstr.substring(x,y);
//                    if(maxstr.contains(minstr)){
//                        return substr;
//                    }
//                }
//            }
//        }
//        return null;
//    }
//}
