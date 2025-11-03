package jobsheet8;
import java.util.Scanner;
public class NilaiKelompok06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int maxNilai = 0;
        int kelompokTertinggi=0;

        while (i<= 6) {
            System.out.println("Kelompok " + i);
            int totalNilai = 0;
            int nilaiTertinggi=0;
            int kelompokTertingggi=0;
            //int maxNilai=0;

            for (int j = 1; j<=5; j++){
                System.out.print("Nilai dari Kelompok Penilai " +j+ ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }

            int rataNilai = totalNilai/5;
            System.out.println("Kelompok " + i +": nilai rata-rata = " +rataNilai);
            System.out.println();

            if (rataNilai > maxNilai) {
                maxNilai = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("Kelompok dengan nilai rata-rata tertinggi adalah kelompok: " +kelompokTertinggi +" dengan rata rata: " +maxNilai);
        sc.close();
    }
    
}
