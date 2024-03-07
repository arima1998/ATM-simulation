package atm.machine.arima;

public class account {
    private int accountNumber;
    private float balance;
    private int PIN;

    public account(int accountNumber,float balance,int PIN){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.PIN = PIN;
    }
    public float checkBalance(int PIN ){
        if(PIN == this.PIN){
            return balance;
        }
        else return -1.0F;
    }

    public void withDrawFund(float amount){
        if(amount > balance){
            System.out.println("Insufficient Funds");
        }
        else {
            balance-=amount;
            System.out.println("Withdrawn amount: "+amount);
        }
    }

    public void depositFund(float amount){
        balance+=amount;
        System.out.println("Deposited Amount: "+amount);
    }

    public int getPIN(){
        return PIN;
    }


}
