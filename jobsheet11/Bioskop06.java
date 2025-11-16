package jobsheet11;

public class Bioskop06 {
    public static void main(String[] args) {

        String [][] penonton = new String [4][2];
        penonton[0][0] = "Amin"; 
        penonton[0][1] = "Bena"; //baris[0], kolom[1]
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana"; //modifikasi nomor 3

        System.out.printf("%s \t %s \n", penonton [0][0], penonton [0][1]);
        System.out.printf("%s \t %s \n", penonton [1][0], penonton [1][1]);
        System.out.printf("%s \t %s \n", penonton [2][0], penonton [2][1]);
        System.out.printf("%s \t %s \n", penonton [3][0], penonton [3][1]);

        //nomor 4
        // System.out.println(penonton.length);
        // System.out.println(penonton[0].length);
        // System.out.println(penonton[1].length);
        // System.out.println(penonton[2].length);
        // System.out.println(penonton[3].length);

        //nomor 5 FOR LOOP (modifikasi nomor 4)
        System.out.println(penonton.length);
        for(int i = 0; i < penonton.length; i++){
            System.out.println("Panjang baris ke-" +(i+1) +": " +String.join(", ", penonton[i]));
        }

        //nomor 6 FOREACH LOOP (modifikasi nomor 5)
        System.out.println(penonton.length);
        for(String[] barisPenonton : penonton){
            System.out.println("Panjang baris: " +barisPenonton.length);
        }

        //nomor 7 menampilkan penonton baris ke 3 FOR LOOP
        System.out.println("Penonton pada baris ke-3: ");
        for(int i=0; i<penonton[2].length; i++){
            System.out.println(penonton[2][i]);
        }

        //nomor 8 menampilkan penonton baris ke 3 FOREACH LOOP (modifikasi nomor 7)
        System.out.println("Penonton pada baris ke-3: ");
        for(String i : penonton[2]){
            System.out.println(i);
        }

    }
}
