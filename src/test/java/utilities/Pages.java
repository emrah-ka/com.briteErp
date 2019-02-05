package utilities;

import pages.CamptocampPage;
import pages.ErkinsPage;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import pages.VendorsPage;
import pages.configuration_accounting.*;
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
    private DocumentsPage documentsPage;
    private AgedPartnerBalance agedPartnerBalance;
    private JournalsAudit journalsAudit;
    private TaxReport taxReport;



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

    public DocumentsPage documents(){
        if(documentsPage ==null){
            documentsPage= new DocumentsPage();
        }
        return documentsPage;
    }
    public AgedPartnerBalance agedPartners(){
        if(agedPartnerBalance == null){
            agedPartnerBalance = new AgedPartnerBalance();
        }
        return agedPartnerBalance;
    }

    public JournalsAudit journalsAudit(){
        if(journalsAudit == null){
            journalsAudit = new JournalsAudit();
        }
        return journalsAudit;
    }
    public TaxReport taxReport(){
        if(taxReport == null){
            taxReport = new TaxReport();
        }
        return taxReport;
    }

}
