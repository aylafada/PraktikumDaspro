package jobsheet11;

import java.util.Scanner;

public class SIAKAD06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        int [][] nilai = new int [baris][kolom];
        // for(int i=0; i<nilai.length; i++){
        //     System.out.println("Input nilai mahasiswa ke-" +(i+1));

        //     for (int j=0; j<nilai[i].length; j++){
        //         System.out.println("Nilai mata kuliah " +(j+i) +": ");
        //         nilai [i][j] = sc.nextInt();
        //     }
        // }
         
        //modifikasi 
        for (int i=0; i<nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" +(i+1));
            double totalPerSiswa = 0;

            for (int j=0; j<nilai[i].length; j++){
                System.out.println("Nilai mata kuliah " +(j+1) +": ");
                nilai [i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            
            System.out.println ("Nilai rata rata: " +totalPerSiswa/kolom);
        }

        System.out.println("\n==================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j=0; j<kolom; j++){
            double totalPerMatkul=0;

            for(int i=0; i<baris; i++){
                totalPerMatkul += nilai [i][j];
            }
            System.out.println("Mata Kuliah " +(j+1) +": " +totalPerMatkul/baris);
        }

    }
    
}
