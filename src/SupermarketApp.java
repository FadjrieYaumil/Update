public class SupermarketApp {
    public static void main(String[] args) {
        market market = new market("IndoAlfaMaret");
        market.welcomeMessage();

        UserAuthentication userAuth = new UserAuthentication();
        userAuth.login();

        MarketInfo marketInfo = new MarketInfo();
        marketInfo.displayInfo();

        Customer customer = new Customer("", "", "SuperMart", "");
        customer.displaySupermarketInfo();
        System.out.println("=====DATA PELANGGAN=====");
        System.out.println(" ");

        customer.inputCustomerData();

        Purchase purchase = new Purchase("SuperMart", "John");
        System.out.println("--DATA PEMBELIAN BARANG-");
        purchase.inputPurchaseData();

        purchase.displayPurchaseData();
    }
}
