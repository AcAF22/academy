package it.ibm.progettoBanca.domain.people;

import it.ibm.progettoBanca.domain.data.Account;

import java.time.LocalDate;

public class Client {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Account[] accounts;
    public Client(String fN, String lN, LocalDate birthDate, int maxAccount){
        firstName=fN;
        lastName=lN;
        dob=birthDate;
        accounts = new Account[maxAccount];
    };
    public String getFirstName(){return firstName;};
    public void setFirstName(String firstName){this.firstName=firstName;};

    public String getLastName(){return lastName;};
    public void setLastName(String lastName){this.lastName=lastName;};

    public LocalDate getDob(){return dob;};
    public void setDob(LocalDate birthdayData){dob=birthdayData;};

    public Account[] getAccount(){return accounts;};
    public void setAccount(Account[] accounts){this.accounts=accounts;};
}
