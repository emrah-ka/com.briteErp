package utilities;

import pages.puchasesMasterData.*;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import pages.configurationManagements.PaymentTerms;
import pages.configurationPayments.PaymentAcquirers;
import pages.configuration_accounting.*;
import pages.LoginPage;
import pages.purchasesDocuments.Payments;
import pages.purchasesDocuments.VendorBills;
import pages.purchasesDocuments.VendorCreditNotes;
import pages.reportingManagemet.Invoices;
import pages.salesDocuments.CustomerCreditNotes;
import pages.salesDocuments.CustomerInvoices;
import pages.salesDocuments.PaymentsSD;
import pages.salesMasterData.Customers;
import pages.salesMasterData.SellableProducts;


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
    private PaymentTerms paymentTerms;
    private PaymentAcquirers paymentAcquirers;
    private PurchasableProducts purchasableProducts;
    private Vendors pmdvendors;
    private Payments paymentsPurchaseDocument;
    private VendorBills vendorBills;
    private VendorCreditNotes vendorCreditNotes;
    private Invoices invoices;
    private CustomerCreditNotes customerCreditNotes;
    private CustomerInvoices customerInvoices;
    private PaymentsSD paymentsSD;
    private Customers customers;
    private SellableProducts sellableProducts;
    private NewVendorPage newVendor;
    private PurchasableProductsPage purchasablePro;
    private NewProductPage newProduct;
    private IpadMini2Page ipadMini2;
    private VintageShirtPage vintageShirt;



    public SellableProducts sellableProducts(){
        if(sellableProducts()==null){
            sellableProducts=new SellableProducts();
        }
        return sellableProducts;
    }

    public Customers customers(){
        if(customers==null){
            customers=new Customers();
        }
        return  customers;
    }

    public PaymentsSD paymentsSD(){
        if(paymentsSD==null){
            paymentsSD=new PaymentsSD();
        }
        return paymentsSD;
    }

    public CustomerInvoices customerInvoices(){
        if(customerInvoices==null){
            customerInvoices= new CustomerInvoices();
        }
        return customerInvoices;
    }

    public CustomerCreditNotes customerCreditNotes(){
        if(customerCreditNotes==null){
            customerCreditNotes= new CustomerCreditNotes();
        }
        return customerCreditNotes;
    }

    public Invoices invoices(){
        if (invoices==null){
            invoices=new Invoices();
        }
        return  invoices;
    }

    public VendorCreditNotes vendorCreditNotes() {
        if(vendorCreditNotes==null){
            vendorCreditNotes=new VendorCreditNotes();
        }
        return vendorCreditNotes;
    }

    public VendorBills vendorBills(){
        if(vendorBills==null){
            vendorBills = new VendorBills();
        }
        return vendorBills;
    }

    public Payments paymentsPurchaseDocument(){
        if(paymentsPurchaseDocument==null){
            paymentsPurchaseDocument = new Payments();
        }
        return paymentsPurchaseDocument;
    }

    public Vendors pmdvendors(){
        if (pmdvendors==null){
            pmdvendors = new Vendors();
        }
        return pmdvendors;
    }

    public PurchasableProducts purchasableProducts(){
        if(purchasableProducts==null){
            purchasableProducts= new PurchasableProducts();
        }
        return purchasableProducts;
    }

    public PaymentAcquirers paymentAcquirers(){
        if(paymentAcquirers==null){
            paymentAcquirers = new PaymentAcquirers();
        }
        return paymentAcquirers;
    }




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
    public PaymentTerms paymentTerms(){
        if(paymentTerms==null){
            paymentTerms = new PaymentTerms();
        }
        return paymentTerms;
    }

    public NewVendorPage newVendor(){
        if(newVendor==null){
            newVendor = new NewVendorPage();
        }
        return newVendor;
    }

    public PurchasableProductsPage purchasablePro(){
        if(purchasablePro==null){
            purchasablePro = new PurchasableProductsPage();
        }
        return purchasablePro;
    }

    public NewProductPage newProduct(){
        if(newProduct==null){
            newProduct = new NewProductPage();
        }
        return newProduct;
    }

    public IpadMini2Page ipadMini2(){
        if(ipadMini2 ==null){
            ipadMini2 = new IpadMini2Page();
        }
        return ipadMini2;
    }

    public VintageShirtPage vintageShirt(){
        if(vintageShirt ==null){
            vintageShirt = new VintageShirtPage();
        }
        return vintageShirt;
    }





}
