package jobsheet8;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Input Penjualan Per Cabang ===");
        System.out.println();
        System.out.print("Jumlah cabang kafe: ");
        int jmlCabang = sc.nextInt();

        int totalPelanggan=0;
        int totalItemAll=0;

        for(int i=1; i<=jmlCabang; i++) {
            System.out.println("--- Cabang " +i +" ---");

            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            int jmlPelanggan=0;
            
            int totalItemCabang=0;  
            for(int j=1; j<=pelanggan; j++) {
                System.out.print("Pelanggan " +j +" memesan berapa item? ");
                int jmlItem = sc.nextInt();
                totalItemCabang += jmlItem;
            }
                
            System.out.println("Cabang " +i);
            System.out.println("Pelanggan: " +pelanggan);
            jmlPelanggan += pelanggan; 
            System.out.println("Item terjual: " +totalItemCabang);
            System.out.println();

            totalPelanggan +=pelanggan;
            totalItemAll += totalItemCabang;
        }
        
        System.out.println("Total Cabang: ");
        System.out.println("Pelanggan: " +totalPelanggan);
        System.out.println("Item terjual " +totalItemAll);
        sc.close();
    }
}
