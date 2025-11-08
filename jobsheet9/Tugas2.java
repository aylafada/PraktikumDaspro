package jobsheet9;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jmlPesanan];
        int[] hargaMenu = new int[jmlPesanan];

        int total=0;
        for(int i=0; i<jmlPesanan; i++) {
            System.out.print("Menu ke-" +(i+1) +": ");
            System.out.println();
            System.out.print("Masukkan nama makanan/minuman: ");
            menu[i] = sc.nextLine();
            System.out.print("Masukkan harga makanan/minuman: ");
            hargaMenu[i] = sc.nextInt();
            sc.nextLine();
            total += hargaMenu[i];
        }

        System.out.println("=== Daftar Pesanan ===");
        for(String i : menu){
            System.out.println("Menu ke-" +i +": ");
        }

        for(int i = 0; i<jmlPesanan; i++) {
            System.out.println((i+1) +". " +menu[i] +" - Rp" +hargaMenu[i]);
        }
        
        System.out.println("Total Biaya: " +total);
    }
}
