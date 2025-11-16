package jobsheet11;

import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        //modifikasi nomor 2
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Input data penonton ");
            System.out.println("2. Tampilkan daftar penonton ");
            System.out.println("3. Exit");
            System.out.println("=== PILIH MENU ===");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
            
                while(true) {

                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input.nextInt();
                        input.nextLine();

                        //modifikasi nomor 3 
                        if (baris<1 || baris>4 || kolom<1 || kolom>2) {
                            System.out.println("Kursi tidak tersedia! Coba lagi ");
                            continue;
                        }

                        //buat ngecek apakah kursi kosong
                        if (penonton [baris-1][kolom-1] == null) {
                            penonton [baris-1][kolom-1] = nama;
                            System.out.println("Kursi berhasil diisi! ");
                            break;

                        } else {
                            //modifikasi nomor 4
                            System.out.println("Kursi sudah terisi! Silakan memilih kursi lain.");
                        }

                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();
                    if (next.equalsIgnoreCase("n")) break;

                }

                //modifikasi nomor 5 
            } else if (menu == 2) {
                System.out.println("=== Daftar Penonton ===");
                for(int i=0; i<penonton.length; i++){
                    for(int j=0; j<penonton[i].length; j++){
                        String namaPenonton = (penonton[i][j] == null) ? "***": penonton[i][j];
                        System.out.print(namaPenonton +"\t");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Exit");
                break;

            } else {
                //modifikasi nomor 4    
                System.out.println("Menu tidak tersedia! ");
            }

        }

        input.close();

    }

}
