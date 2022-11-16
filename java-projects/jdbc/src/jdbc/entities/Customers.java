package jdbc.entities;

public class Customers {
    private int custid;
    private String companyname;
    private String city;

    public Customers(int custid, String companyname, String city) {
        this.custid = custid;
        this.companyname = companyname;
        this.city = city;
    }

    public int getCustid() {
        return custid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getCity() {
        return city;
    }


}
