package atm.machine.arima;

public class Transaction {
    public void withdraw(account A , float amount){
        A.withDrawFund(amount);
    }
    public void deposit(account A , float amount){
        A.depositFund(amount);
    }
}
