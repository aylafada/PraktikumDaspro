package jobsheet8;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (nilai minimal 3) = ");
        int n = sc.nextInt();
 
        //iOuter : baris/vertikal (loop luar)
        //i : kolom/horizontal (loop dalam)
        //mengecek posisi: i!=1 bukan kolom pertama && iOuter!=1 bukan baris pertama

        for(int iOuter=1; iOuter<=n; iOuter++){
            for(int i = 1; i<=n; i++){
                if ((i!=1 && iOuter!=1)  && (i!=n && iOuter!=n))
                    if (n > 9) System.out.print(" " +" " +" " + " ");
                    else 
                    System.out.print(" " +" " +" ");
                else 
                System.out.print(" " +n +" " );
            }
            System.out.println();
        } 
    }
}
