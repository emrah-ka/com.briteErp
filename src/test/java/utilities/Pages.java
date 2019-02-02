package utilities;

import pages.LoginPage;
import pages.configuration_accounting.CustomerCreditNotesPage;
import pages.configuration_accounting.TaxesPage;

public class Pages {
    private LoginPage loginPage;
    private TaxesPage taxesPage;
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

    public CustomerCreditNotesPage creditNotesPage(){
        if(creditNotesPage==null){
            creditNotesPage = new CustomerCreditNotesPage();
        }
        return creditNotesPage;
    }




}
