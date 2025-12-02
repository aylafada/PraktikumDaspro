package jobsheet14;

import java.util.Scanner;

public class Tugas {
    
    public static int totalIteratif(int[] angka){
        int total = 0;
        for (int i = 0; i<angka.length; i++) {
            total += angka[i];
        }
        return total;
    }

    public static int totalRekursif (int[] angka, int idx) {
        if (idx == angka.length) {
            return 0;
        }
        return angka[idx] + totalRekursif(angka, idx +1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        for(int i = N - 1; i>=0; i--) {
            System.out.println("Masukkan angka ke-" +(i+1) +": ");
            angka[i] = sc.nextInt();
        }

        int totalIter = totalIteratif(angka);
        int totalRek = totalRekursif(angka, 0);

        System.out.println("Total dari " +N +" angka yang dimasukkan adalah: " +totalIter);
        System.out.println("(Versi Rekursif) Total = " +totalRek );
    }   

}
