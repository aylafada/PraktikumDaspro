package jobsheet12;

import java.util.Scanner;

public class RekapPenjualanCafe06 {
    
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    public static void isianData (int[][]rekapPenjualan){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<rekapPenjualan.length;i++) {
            System.out.println("=== Input Penjualan " +menu[i] +" === ");
            for(int j = 0; j<rekapPenjualan[i].length; j++ ) {
                System.out.print("Hari ke-" +(j+1) +": ");
                rekapPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilData (int[][]rekapPenjualan) {
        System.out.println("=== Data Penjualan Cafe ===");
        System.out.println("Menu/Hari");
        for (int k = 0; k<rekapPenjualan[0].length; k++){
            System.out.println("H" +k +"\t");
        }
        System.out.println();

        for (int i = 0; i<rekapPenjualan.length; i++) {
            System.out.println(menu[i] +"\t");
            for (int j = 0; j<rekapPenjualan[i].length; j++) {
                System.out.println(rekapPenjualan[i][j] +"\t");
            }
            System.out.println();
        }
    }

    public static int penjualanMax (int [][] rekapPenjualan) {
        int maxTotal = -1;
        String menuMax = "";

        for(int i = 0; i<rekapPenjualan.length; i++) {
           int total = 0;
           for (int j = 0; j<rekapPenjualan[i].length; j++) {
            total += rekapPenjualan[i][j];
           }

           if (total > maxTotal){
            maxTotal = total;
            menuMax = menu[i];
           }
        }
        System.out.println("Menu penjualan tertinggi adalah: " );
        System.out.println(menuMax+ " (" +maxTotal +" penjualan)");

        return maxTotal;
    }

    public static void rataPenjualan (int [][] rekapPenjualan) {
        System.out.println(" === Rata-rata Penjualan ===");

        for (int i = 0; i<rekapPenjualan.length; i++) {
            double total = 0;
            for (int j = 0; j<rekapPenjualan[i].length; j++){
                total += rekapPenjualan [i][j];
            }
            double rata = total/rekapPenjualan[i].length;
            System.out.println(menu[i] +" = " +rata);
        }
    }
    
    public static void main(String[] args) {

        int [][] rekapPenjualan = new int [5][7];

        isianData(rekapPenjualan);
        tampilData(rekapPenjualan);
        penjualanMax(rekapPenjualan);
        rataPenjualan(rekapPenjualan);
    }
}
