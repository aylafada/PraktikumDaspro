package jobsheet12;

import java.util.Scanner;

public class Kubus06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s, Lp, vol;

        System.out.print("Masukkan panjang sisi: ");
        s = sc.nextInt();

        Lp = hitungLp(s);
        System.out.println("Luas permukaan kubus adalah: " +Lp);
        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah: " +vol);

        sc.close();
    }
    
    static int hitungLp(int sisi){
        int LuasPermukaan = 6*sisi*sisi;
        return LuasPermukaan;
    }

    static int hitungVolume(int sisi) {
        int Volume = sisi*sisi*sisi;
        return Volume;
    }
}
