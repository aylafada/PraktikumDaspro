package jobsheet12;

import java.util.Scanner;

public class NilaiMahasiswa06 {

    public static void isianArray (int[] nilaiMhs){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1) +": ");
            nilaiMhs[i] = sc.nextInt();
        }
    }

    public static void tampilArray (int [] nilaiMhs) {
        for(int j = 0; j<nilaiMhs.length; j++) {
            System.out.println("Nilai mahasiswa ke- " +(j+1) +" adalah: " +nilaiMhs[j]);
        }
    }

    public static int hitTot (int [] nilaiMhs) {
        int totNilaiMhs = 0;
        for(int i = 0; i<nilaiMhs.length; i++) {
            totNilaiMhs += nilaiMhs[i];
        }
        return totNilaiMhs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int [] nilaiMhs = new int [jmlMhs];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);
        int totNilaiMhs = hitTot(nilaiMhs);
        System.out.print("Jumlah nilai " +jmlMhs +" mahasiswa adalah: " +totNilaiMhs);
    }
    

}
