package data; //gruppo logico e gruppo fisico

public class Account {
    public Account(){} //costruttore di default
    public Account(double initialBalance){
        balance = initialBalance;
    }
    public double balance;
    public void printBalance(){
        System.out.println(balance);
    };
}
