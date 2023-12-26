import java.util.InputMismatchException;
import java.util.Scanner;

class Purchase extends SuperMarket implements iPurchaceData {
    String KodeProduk;
    String NamaProduk;
    double HargaProduk;
    int quantity;
    double TotalBayar;
    boolean input = true;


    Purchase(String marketName, String cashier) {
        super(marketName, cashier);
    }

    @Override
    public void inputPurchaseData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode Barang   : ");
        KodeProduk = scanner.nextLine();
        System.out.print("Nama Barang   : ");
        NamaProduk = scanner.nextLine();
        
        do {
            try {
                System.out.print("Harga Barang  : ");
                HargaProduk = scanner.nextDouble();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("Nama Barang Bukanlah Huruf!!");
                scanner.next();
            }
        } while (input);


        System.out.print("Jumlah Beli   : ");
        quantity = scanner.nextInt();

        // Menghitung total bayar
        TotalBayar = HargaProduk * quantity;
        scanner.close();
    }

    @Override
    public void displayPurchaseData() {
        System.out.println("TOTAL BAYAR   : " + TotalBayar);
        System.out.println("++++++++++++++++++++++++");
    }
    
}