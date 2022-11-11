package it.ibm.progettoBanca.domain.exceptions;

public class OverdrawException extends Exception{
    private double balance;
    private double amount;
    public OverdrawException(String message) {
        super(message);
        this.balance;
        this.amount;
    }
    public double getBalance(){return this.balance;};
    public double getAmount(){return this.amount;};
}

//Scanner sc = new Scanner(system.in);
// System.out.print("id corso: ");
//int id = sc.nextInt(); legge e converte in intero
// System.out.println(id);
// String title = sc.nextLine(); legge stringhe