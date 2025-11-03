package jobsheet8;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        //outer: baris (i)
        //inner: kolom (j)
        for (int i = 1; i <= n; i++) {
            int jumlah = 0;
            System.out.print("Jumlah kuadrat 1 s.d " + i + " = ");
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j*j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}