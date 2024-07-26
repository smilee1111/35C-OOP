public class BankingSystem {
    public static void main(String[] args) {
       BankAccount bs=new BankAccount("1001", "Muskan", 10);
    System.out.println(bs.getAccountPrice());
    bs.deposit(100);
    System.out.println(bs.getAccountPrice());
    bs.withdraw(10);
    System.out.println(bs.getAccountPrice());
    bs.withdraw(1000);
    System.out.println(bs.getAccountPrice());
    }
}
interface Transaction{
    public double getAmount();
    public boolean isValid();
}
class DepositTransaction implements Transaction{
    @Override
    public double getAmount(){
        BankAccount ba=new BankAccount("1001","Muskan",10);
        return ba.Transac;
    }
    public boolean isValid(){
        BankAccount ba=new BankAccount("1001","Muskan",10);
        boolean p=true;
        if(ba.Transac>100000){
            p=false;
        }
        return p;
    }
}
class WithdrawTransaction implements Transaction{
    @Override
    public double getAmount(){
        BankAccount ba=new BankAccount("1001","Muskan",10);
        return ba.Transac;
    }
    public boolean isValid(){
        BankAccount ba=new BankAccount("1001","Muskan",10);
        boolean p=true;
        if(ba.Transac>100000){
            p=false;
        }
        return p;
    }
}
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double accountPrice;
    public double Transac;
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public double getAccountPrice(){
        return this.accountPrice;
    }
    BankAccount(String accountNumber,String accountHolderName,
    double accountPrice){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountPrice=accountPrice;

    }
    public void deposit(double money){
        this.accountPrice+=money;
        Transac+=money;
    }
    public void withdraw(double money){
        if(money>accountPrice){
            System.out.println("You are poor");
        }else{
            accountPrice-=money;
            Transac+=money;
        }

    }

}
//Your are building a banking application that has a BankAccount class.
//Implement the BankAccount class with encapsulation principles in mind.
//Include private instance variables for the 
//account number, account holder name, and account balance.
//Provide public methods to allow clients to deposit and withdraw funds,
//as well as access the account balance.
//Ensure that the account balance cannot be accessed or modified directly.
//Ensure that user cannot withdraw balance if it can go to negative
//Note make constructor to fill the attribute on account opening
//Mkake getter for account number and account holder name 


