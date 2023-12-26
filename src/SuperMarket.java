import java.util.Scanner;
abstract class SuperMarket {
    String NamaSupermarket;
    String Kasir;
    Scanner scan = new Scanner(System.in);

    SuperMarket(String name, String Kasir) {
        this.NamaSupermarket = name;
        this.Kasir = Kasir;
    }

    void displaySupermarketInfo() {
        System.out.println("INDOALFAMARET");
        System.out.println("========================");
        System.out.println("DATA PELANGGAN") ;
        System.out.println("------------------------");
        System.out.print("Kasir    : ");
        Kasir = scan.nextLine();
        System.out.println("\n========================");
        
    }
}