package utilities;

import pages.*;
import pages.configurationAccounting.BankAccounts;
import pages.configurationAccounting.FiscalPositions;
import pages.configuration_accounting.CustomerCreditNotesPage;
import pages.configurationAccounting.Journals;
import pages.configurationAccounting.TaxesPage;
import pages.LoginPage;
public class Pages {
    private LoginPage loginPage;
    private TaxesPage taxesPage;
    private BankAccounts bankAccounts;
    private FiscalPositions fiscalPositions;
    private Journals journals;
    private CustomerCreditNotesPage creditNotesPage;



    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public TaxesPage taxes(){
        if(taxesPage ==null){
            taxesPage= new TaxesPage();
        }
        return taxesPage;
    }

    public BankAccounts bankaccounts() {
        if (bankAccounts == null) {
            bankAccounts = new BankAccounts();
        }
        return bankAccounts;
    }

    public FiscalPositions fiscalpositions() {
        if (fiscalPositions == null) {
            fiscalPositions = new FiscalPositions();
        }
        return fiscalPositions;
    }

    public Journals jorunalss() {
        if (journals == null) {
            journals = new Journals();
        }
        return journals;
    }

    public CustomerCreditNotesPage creditNotesPage(){
        if(creditNotesPage==null){
            creditNotesPage = new CustomerCreditNotesPage();
        }
        return creditNotesPage;
    }

}
