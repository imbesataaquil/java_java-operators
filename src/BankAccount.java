public class BankAccount {
    String accountHolderName;
    int accountNumber;
    int balance;
    BankAccount(String accountHolderName,int accountNumber,int balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void getAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void getAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getBalance(){
        this.balance=balance;
        return  0;
    }
    public String setAccountHolderName(){
        return accountHolderName;
    }
    public int setAccountNumber(){
        return accountNumber;
    }
    public int setBalance(){
        return balance;
    }
    public void deposit(int amt){
        if (amt>0){
            balance=balance+amt;
            System.out.println("money deposited "+amt);
        }
        else {
            System.out.println("money is not deposited");
        }
    }
    public void withdraw(int amt){
        if (amt>0 && amt<=balance){
            balance=balance-amt;
            System.out.println("money withdraw "+amt);
        }
        else if (amt>balance){
            System.out.println("you dont have suffient fund");
        }
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Imbesat",1238,10000);
        b1.deposit(5000);
        b1.withdraw(2000);
        int yourBalance= b1.getBalance();
        String status=(yourBalance>=5000) ? "minimum balance maintained ":"minimum balance not maintained ";
        System.out.println("account status : "+status);
    }
}
