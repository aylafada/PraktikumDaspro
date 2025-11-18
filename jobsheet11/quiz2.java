package jobsheet11;

import java.util.Scanner;

public class quiz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah wilayah: ");
        int wilayah = sc.nextInt();
        System.out.print("Masukkan jumlah kategori donasi: ");
        int kategori = sc.nextInt();
        sc.nextLine(); 

        String[] namaWilayah = new String[wilayah];
        String[] namaKategori = new String[kategori];

        //inputkategori
        System.out.println("=== Nama Kategori Donasi ===");
        for (int i=0; i<kategori; i++) {

            System.out.print("Kategori ke-" +(i+1) +": ");
            namaKategori[i] = sc.nextLine();
        }

        int[][] donasi = new int[wilayah][kategori];

        //input data 
        System.out.println("=== Input Data Donasi ===");
        for (int i=0; i<wilayah; i++) {

            System.out.print("Nama wilayah ke-" +(i + 1) +": ");
            System.out.println();

            namaWilayah[i] = sc.nextLine();

            for (int j=0;j<kategori; j++) {
                
                System.out.print("Jumlah " +namaKategori[j] +": ");
                donasi[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        //total
        int[] totalKategori= new int[kategori];
        int[] totalWilayah= new int[wilayah];
        int totalSemua = 0;

        for (int i=0; i<wilayah; i++) {

            for (int j = 0; j < kategori; j++) {

                totalWilayah[i] += donasi[i][j];
                totalKategori[j] +=donasi[i][j];
                totalSemua += donasi[i][j];




            }
        }


        System.out.println();
        System.out.println("=== Tabel ===");
        System.out.print(String.format( "Wilayah"));

        for (int j=0; j<kategori; j++) {

            System.out.print(namaKategori[j]);
        }
        System.out.println("Total");

        for (int i=0; i<wilayah; i++) {
            System.out.print(namaWilayah[i]);

            for (int j=0; j<kategori; j++) {
                System.out.print(donasi[i][j]);
            }
            System.out.println(totalWilayah[i]);
        }

        System.out.print("Total");

        for (int j=0; j<kategori; j++) {
            System.out.print(totalKategori[j]);
        }
        System.out.println(totalSemua);

        //presentase
        System.out.println();
        System.out.println("=== Persentase ===");
        for (int j=0; j<kategori; j++) {

            double persentase = (double) totalKategori[j] /totalSemua *100;
            System.out.printf("%s: %.2f%%\n", namaKategori[j], persentase);
        }
            

        //kontributor perkategori

        for (int j=0; j<kategori; j++) {
            int max = -1;
            int n = -1;

            for (int i=0; i<wilayah; i++) {
                if (donasi[i][j]>max) {
                    max= donasi[i][j];
                    n= i;
                }
            }

            System.out.print(namaKategori[j] +" terbesar disumbang oleh " +namaWilayah[n] +" (" +max + ")");
        }
    }
}
