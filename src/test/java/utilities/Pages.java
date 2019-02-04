package utilities;

import pages.CamptocampPage;
import pages.ErkinsPage;
import pages.VendorsPage;
import pages.configuration_accounting.BankAccounts;
import pages.configuration_accounting.FiscalPositions;
import pages.configuration_accounting.CustomerCreditNotesPage;
import pages.configuration_accounting.Journals;
import pages.configuration_accounting.TaxesPage;
import pages.LoginPage;


public class Pages {
    private LoginPage loginPage;
    private TaxesPage taxesPage;
    private BankAccounts bankAccounts;
    private FiscalPositions fiscalPositions;
    private Journals journals;
    private CustomerCreditNotesPage creditNotesPage;
    private VendorsPage vendorsPage;
    private CamptocampPage camptocampPage;
    private ErkinsPage erkinsPage;



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
    public VendorsPage vendors() {
        if (vendorsPage == null) {
            vendorsPage = new VendorsPage();
        }
        return vendorsPage;
    }

    public CamptocampPage camptocamp() {
        if (camptocampPage == null) {
            camptocampPage = new CamptocampPage();
        }
        return camptocampPage;
    }

    public ErkinsPage erkins() {
        if (erkinsPage == null) {
            erkinsPage = new ErkinsPage();
        }
        return erkinsPage;
    }

}
