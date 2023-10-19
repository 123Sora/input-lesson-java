package simplebankaccount;

public class Bank {
    //instance variable
    private  double balance ;
    //constructor for objects of class Bank
    public Bank(){
        balance = 0 ;
    }
    //add money to the balance
    //param amount the amount to deposit
    // return void
    public void deposit( double amount){
        balance += amount;
    }
    //remove money from the balance
    //param amount the amount to withdraw
    //return true (success) or false (failure)
    public boolean withdraw(double amount){
        if (balance - amount >=0){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }
    //get the balance
    public double getBalance(){
        return balance;
    }


}
