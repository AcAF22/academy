package program;
import java.time.LocalDate;
import hr.Client;

public class Start {
    public static void main(String[] args)
    {
        Client c = new Client("ciccio","pluto",LocalDate.of(1980, 10, 20),5);
        System.out.println(c.firstName);
    }
}
