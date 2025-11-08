package jobsheet9;
import java.util.Scanner;
public class Tugas1 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlahMhs = sc.nextInt();
    int [] nilaiMhs = new int[jumlahMhs]; 

    double total=0;
    for(int i = 0; i<nilaiMhs.length; i++){
        System.out.print("Masukkan nilai mahasiswa: ");
        nilaiMhs[i] = sc.nextInt();
        total += nilaiMhs[i];
    }

    double rata = total/nilaiMhs.length;
    System.out.println("Nilai rata rata mahasiswa adalah: " +rata);

    int min, max;
    max = min = nilaiMhs[0];
    for(int i=0; i<nilaiMhs.length; i++){
        if(nilaiMhs[i]>max){
            max = nilaiMhs[i];
        }
        if(nilaiMhs[i]<min){
            min = nilaiMhs[i];
        }
    }
    System.out.println("Nilai tertinggi: " +max);
    System.out.println("Nilai terendah: " +min);

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
    }


}}
