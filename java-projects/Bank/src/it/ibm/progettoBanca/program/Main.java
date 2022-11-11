package it.ibm.progettoBanca.program;

import it.ibm.progettoBanca.domain.data.Account;
import it.ibm.progettoBanca.domain.data.ForeignAccount;
import it.ibm.progettoBanca.domain.exceptions.OverdrawException;
import it.ibm.progettoBanca.domain.people.Client;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("ciccio", "pluto", LocalDate.of(1980, 10, 10),5);
        System.out.println(c1.getFirstName());
        c1.setFirstName("Pippo"); //esegui setfirstname nel contesto dell'oggetto c1 (indirizzo) come se succedesse setFirstName(c1,"Pippo);
        System.out.println(c1.getFirstName());
        ForeignAccount fA = new ForeignAccount(1000, "FR");
        Account x = new Account();
        x.deposit(1000);
        try {
            double s = x.withdraw(500);
            System.out.println(s);
            System.out.println(x.withdraw(501));
        } catch (OverdrawException e) {
            System.out.println(e.getMessage());
            System.out.println("volevi sforare di: "+ (e.getAmount() - e.getBalance()));
        }
//        try {
//            x.withdraw(501);
//        } catch (OverdrawException e) {
//            throw new RuntimeException(e);
//        }
    }
}