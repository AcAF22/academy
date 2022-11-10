package it.ibm.progettoBanca.domain.data;

import java.time.LocalDate;

public class ForeignAccount extends Account{
    private String countryCode;
    public ForeignAccount(double balance, String countryCode){ //costruttore classe figlia 1 cosa) chiamare costruttore classe madre
        super(balance);//chiama costruttore casa madre
        this.countryCode = countryCode;
    };
    public double foreignTransfer(double amount, ForeignAccount receiver){
        return 0; //tassa da pagare 10%
    }
}
