package jobsheet7;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int jumlahTiket = -1;
        double totalPendapatan = 0;
        double diskon = 0;

        while (jumlahTiket !=0) {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Nilai tidak valid! Masukkan lagi nilai yang valid! ");
                continue;
            }

            if (jumlahTiket > 0) {
                diskon = 0;   
                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = 0.1;
                }

                double totalHarga = jumlahTiket * hargaTiket * (1-diskon);
                totalPendapatan += totalHarga;
                totalTiket += jumlahTiket;

                System.out.println("Total harga untuk pelanggan ini: Rp " +totalHarga );
            } 
        }
        System.out.println("===PENJUALAN HARI INI===");
        System.out.println("Total tiket yang terjual: " +totalTiket);
        System.out.println("Total pendapatan: " +totalPendapatan);
    } 
}
