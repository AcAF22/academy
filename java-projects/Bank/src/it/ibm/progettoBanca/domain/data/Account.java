package it.ibm.progettoBanca.domain.data;

import it.ibm.progettoBanca.domain.exceptions.OverdrawException;

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
    public double withdraw(double amount) throws OverdrawException {
        if(amount>balance){
            OverdrawException e =
                    new OverdrawException("CIOCCIO NON FARE IL FURBO, MAGARI AVESSI QUESTI SOLDI!!!",balance,amount);
            throw e;
        }
        this.balance-=amount;
        return this.balance;
    };
    public double deposit(double amount){this.balance+=amount; return this.balance;};
    public double transfer(double amount, Account receiver) throws OverdrawException {
        this.withdraw(amount);
        receiver.deposit(amount);
        return this.balance;
    }
}
