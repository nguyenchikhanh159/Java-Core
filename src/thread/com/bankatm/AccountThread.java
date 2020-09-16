package thread.com.bankatm;

public class AccountThread {
    public static void main(String[] args) {

        Account account = new Account();
        AccountWorker accountHolder1 = new AccountWorker(account);
        
        Thread t1 = new Thread(accountHolder1);
        Thread t2 = new Thread(accountHolder1);
        Thread t3 = new Thread(accountHolder1);

        t1.setName("AriaStak");
        t2.setName("DragonMom");
        t3.setName("NightKing");

        t1.start();
        t2.start();
        t3.start();
    }
}
