/**
 * 将单例模式中的懒汉式改写为线程安全的
 *
 * @author LiuJun
 * @create 2021-8-26-14:25
 */
public class BankTest {


}

class Bank{

    private Bank(){

    }

    private Bank bank=null;

    public synchronized Bank getBank(){
        if(bank==null){
            bank=new Bank();
            return bank;
        }
        return bank;
    }
}