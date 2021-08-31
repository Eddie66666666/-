/**
 * @author LiuJun
 * @create 2021-8-26-22:21
 */
class Account{
    private double balance;

    public Account(double balance){
        this.balance=balance;
    }

    public synchronized void deposit(double money){
        if(money>0){
            balance+=money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"存钱成功，余额为"+balance);
        }
    }

}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct){
        this.acct=acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(2000);
        }

    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer3 = new Customer(account);
        Customer customer4 = new Customer(account);

        customer3.setName("甲");
        customer4.setName("乙");

        customer4.start();
        customer3.start();



    }
}
