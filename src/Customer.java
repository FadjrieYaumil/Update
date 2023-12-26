import java.util.Scanner;

class Customer extends SuperMarket implements iCustomerData {
    String NamaCostumer;
    String customerAddress;
    Scanner scanner = new Scanner(System.in);

    Customer(String name, String address, String marketName, String cashier) {
        super(marketName, cashier);
        this.NamaCostumer = name;
        this.customerAddress = address;
    }

    @Override
    public void inputCustomerData() {
        System.out.print("Nama Pelanggan : ");
        NamaCostumer = scanner.nextLine();
        System.out.print("Alamat         : ");
        customerAddress = scanner.nextLine();
        System.out.println("+++++++++++++++++++");

    }
    
}