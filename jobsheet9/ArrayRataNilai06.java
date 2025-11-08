package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rataLulus, rataTidakLulus;
        int jmlMahasiswa;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jmlMahasiswa];

        int totall = 0;
        int totaltl = 0;
        int jmlMhsL=0;
        int jmlMhsTl=0;
        for(int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();

            // total += nilaiMhs[i];
            if(nilaiMhs[i]>70){
                System.out.println("Mahasiswa ke-" +(i+1) +" lulus! ");
                totall += nilaiMhs[i];
                jmlMhsL++;
            } else {
                System.out.println("Mahasiswa ke- " +(i+1) +" tidak lulus!");
                totaltl += nilaiMhs[i];
                jmlMhsTl++;
            }

        }

        //rata = total/nilaiMhs.length;
        //System.out.println("Rata-rata nilai = " +rata);
        rataLulus = totall/jmlMhsL;
        System.out.println("Rata-rata nilai lulus adalah: " +rataLulus);
        rataTidakLulus = totaltl/jmlMhsTl;
        System.out.println("Rata-rata nilai tidak lulus adalah: " +rataTidakLulus);

        sc.close();
    }
}
