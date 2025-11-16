package jobsheet9;
import java.util.Scanner;

public class KTI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // // Input tiga bilangan
        // System.out.print("Masukkan bilangan pertama (A): ");
        // int A = sc.nextInt();
        // System.out.print("Masukkan bilangan kedua (B): ");
        // int B = sc.nextInt();
        // System.out.print("Masukkan bilangan ketiga (C): ");
        // int C = sc.nextInt();

        // int terbesar, tengah, terkecil;

        // // Menentukan urutan dari terbesar ke terkecil
        // if (A >= B && A >= C) {
        //     terbesar = A;
        //     if (B >= C) {
        //         tengah = B;
        //         terkecil = C;
        //     } else {
        //         tengah = C;
        //         terkecil = B;
        //     }
        // } else if (B >= A && B >= C) {
        //     terbesar = B;
        //     if (A >= C) {
        //         tengah = A;
        //         terkecil = C;
        //     } else {
        //         tengah = C;
        //         terkecil = A;
        //     }
        // } else {
        //     terbesar = C;
        //     if (A >= B) {
        //         tengah = A;
        //         terkecil = B;
        //     } else {
        //         tengah = B;
        //         terkecil = A;
        //     }
        // }

        // // Output hasil urutan
        // System.out.println("\nUrutan dari terbesar ke terkecil:");
        // System.out.println(terbesar + " " + tengah + " " + terkecil);

        // sc.close();

        int a, b, c, temp;

        System.out.println("=== Program Mengurutkan 3 Angka dari Kecil ke Besar ===");

        // Input nilai
        System.out.print("Masukkan nilai a: ");
        a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        b = input.nextInt();

        System.out.print("Masukkan nilai c: ");
        c = input.nextInt();

        // Proses pengurutan
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        // Output hasil
        System.out.println("\n=== Hasil Pengurutan ===");
        System.out.println("Nilai terurut dari kecil ke besar:");
        System.out.println(a + ", " + b + ", " + c);

        input.close();
    }
}
