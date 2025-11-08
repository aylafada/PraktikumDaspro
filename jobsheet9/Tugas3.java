package jobsheet9;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.println("=== MENU ====");

        for(int i = 0; i<menu.length; i++) {
            System.out.println((i+1) +". " +menu[i]);
        }

        System.out.print("Masukkan menu yang ingin di pesan: ");
        String key = sc.nextLine();

        int hasil = -1;
        for(int i=0; i<menu.length; i++){
            if (menu[i].equalsIgnoreCase(key)){
                hasil = i;
                break;
            }
        }

        if(hasil !=-1) {
            System.out.println("Makanan Tersedia.");
        } else {
            System.out.println("Makanan Tidak Tersedia. ");
        }
       
    }
}
