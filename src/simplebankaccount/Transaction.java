package simplebankaccount;

//driver code from Bank class
public class Transaction {
    public static void main(String[] args) {
//        Bank checking;
//        checking = new Bank(); or
        Bank checking = new Bank();
        checking.deposit(123.45);
        checking.deposit(221.45);

        System.out.println("Balance : "+checking.getBalance());
        checking.withdraw(250.00);
        System.out.println("Balance : "+checking.getBalance());
    }
}
