/**
 * @author LiuJun
 * @create 2021-8-26-19:52
 */
public class Threadtest {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread() {
            public void run () {
            synchronized (s1) {
                s1.append("a");
                s2.append("1");
                synchronized (s2) {
                    s1.append("b");
                    s2.append("2");
                    System.out.println(s1);
                    System.out.println(s2);

                }
            }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                 synchronized (s2){
                     s1.append("c");
                     s2.append("3");
                     synchronized (s1){
                         s2.append("d");
                         s1.append("4");
                     }
                 }
            }
        }){

        }.start();
    }
}
