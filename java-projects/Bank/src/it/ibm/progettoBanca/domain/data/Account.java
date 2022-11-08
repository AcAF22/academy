package it.ibm.progettoBanca.domain.data;

public class Account {
    public Account(){} //costruttore di default
    public Account(double initialBalance){
        balance = initialBalance;
    }
    private double balance;
    public void printBalance(){
        System.out.println(balance);
    };
    public double getBalance(){return balance;};
    public double withdraw(double amount){this.balance-=amount; return this.balance;};
    public double deposit(double amount){this.balance+=amount; return this.balance;};
    public double transfer(double amount, Account receiver){
        this.withdraw(amount);
        receiver.deposit(amount);
        return this.balance;
    }
}
