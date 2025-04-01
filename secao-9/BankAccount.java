public class BankAccount {
    private final int number;
    private String name;
    private double balance;

    public BankAccount(int number, String name, double firstDeposit){
        this.number = number;
        this.name = name;
        this.balance = firstDeposit;
    }

    public BankAccount(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        this.balance -= (value + 5);
    }

    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.number, this.name, this.balance);
    }
}
