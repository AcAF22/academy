package hr;
import java.time.LocalDate;
import data.Account;

public class Client {
    public String firstName;
    public String lastName;
    public LocalDate dob;
    public Account[] accounts;
    public Client(String fN, String lN, LocalDate birthDate, int maxAccount){
        firstName=fN;
        lastName=lN;
        dob=birthDate;
        accounts = new Account[maxAccount];
    };
}
