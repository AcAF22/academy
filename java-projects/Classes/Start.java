public class Start {
    public static void main(String[] args) {
        int x = 3;
        Account y = new Account();
        y.printBalance();
        System.out.println(y.balance);
        y.balance=100;
        y.printBalance();
        int z1= 1;
        int z2 = 2;
        swap(z1, z2);
        System.out.println(z1+" "+z2);
        Account a1 = new Account();
        Account a2 = new Account();
        a1.balance=100; //reference a1 ad account (oggetto)
        a2.balance=200; //reference a2 ad account (oggetto)
        swap(a1, a2);
        System.out.println(a1.balance+" "+a2.balance);
        Account a3 = new Account(150);
    }
    public static void swap(int x1, int x2)
    {
        int temp=0;
        x1 = temp;
        x2 = x1;
        x2 = temp;
    }
    public static void swap(Account x1, Account x2)
    {
        double temp = x1.balance;
        x1.balance = x2.balance;
        x2.balance = temp;
    }
}
