package jobsheet9;
import java.util.Scanner;
public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan  diinput: ");
        int jmlNilai = sc.nextInt();

        int[] arrNilai = new int[jmlNilai];
        int key;

        for(int i=0; i<arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " +(i+1) +": ");
            arrNilai[i] = sc.nextInt();
        }
    
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        String found = "false";
        for(int i=0; i<arrNilai.length; i++){   
            if (key == arrNilai[i]){
                //int hasil = i;
                System.out.println("Nilai  " +key +" merupakan nilai mahasiswa ke- " +(i+1));
                found = "true";
                // break;
            } 
            // else {
            //     System.out.println("Nilai tidak dapat ditemukan. ");
            //     // break;
            // }
        }
        if(found.equals("false")){
            System.out.println("Nilai tidak dapat ditemukan. ");
        }

        // System.out.println();
        // System.out.println("Nilai  " +key +" merupakan nilai mahasiswa ke- " +hasil) ;
        // System.out.println();

    }
}
