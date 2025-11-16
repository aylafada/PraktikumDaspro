package jobsheet11;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] survei = new int [10][6];

        //i: jumlah responden
        //j: jumlah pertanyaan
        for (int i=0; i<survei.length;i++){
            System.out.println("Responden ke-" +(i+1));
            
            for(int j=0; j<survei[i].length; j++){
                System.out.print("Masukkan nilai pertanyaan ke-" +(j+1) +" (1-5): ");
                survei[i][j]= sc.nextInt();
               
            }

        }

        //rata rata per responden
        System.out.println();
        double jmlRataResponden=0;
        for(int i=0; i<survei.length; i++){
            int nilaiResponden=0;
            for(int j=0; j<survei[i].length;j++){
                nilaiResponden += survei[i][j];
            }
            double rataNilaiResponden = (double) nilaiResponden/survei[i].length;
            System.out.println("Rata-rata nilai responden " +(i+1) +" adalah: " +rataNilaiResponden);
            jmlRataResponden +=rataNilaiResponden;
        }  
        
        //rata rata per pertanyaan
        System.out.println();
        double jmlRataPertanyaan=0;
        for(int i=0; i<survei.length; i++){
            int nilaiPertanyaan=0;
            for(int j=0; j<survei[i].length; j++){
                nilaiPertanyaan+=survei[i][j];
            }
            double rataNilaiPertanyaan = (double) nilaiPertanyaan/survei[i].length;
            System.out.println("Rata rata nilai pertanyaan ke " +(i+1) +" adalah: " +rataNilaiPertanyaan);
            jmlRataPertanyaan += rataNilaiPertanyaan;
        }

        //rata nilai keduanya 
        System.out.println();
        double totalAll = (jmlRataPertanyaan+jmlRataResponden)/2;
        System.out.println("Rata-rata keduanya adalah: " +totalAll);
    }
}
