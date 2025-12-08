package jobsheet13;

import java.util.Scanner;

public class StudiKasus {

    static String[][] dataMagang = new String [500][6]; 
    static int jumlahData = 0;
    static Scanner sc = new Scanner(System.in);

    //fungsi input data
    static void InputData() {
        System.out.println(" == Tambah Data Magang == ");
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Program Studi: ");
        String prodi = sc.nextLine();
        System.out.print("Perusahaan tujuan magang: ");
        String perusahaanMagang = sc.nextLine();

        String semester;
        while(true) {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semester = sc.nextLine();

            if (semester.equals("6") || semester.equals("7")) {
                break;
            } else {
                System.out.println("Hanya boleh diisi semester 6 atau 7!");
            }
        }

        String status;
        while (true) {
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak): ");
            status = sc.nextLine();

            if (status.equalsIgnoreCase("Diterima") || status.equalsIgnoreCase("Menunggu") || status.equalsIgnoreCase("Ditolak")) {
                break;
            } else {
                System.out.print("Status harus: Diterima/Menunggu/Ditolak!");
            }
        }

        //simpan ke array
        dataMagang[jumlahData][0] = nama;
        dataMagang[jumlahData][1] = nim;
        dataMagang[jumlahData][2] = prodi;
        dataMagang[jumlahData][3] = perusahaanMagang;
        dataMagang[jumlahData][4] = semester;
        dataMagang[jumlahData][5] = status;

        jumlahData++;
        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " 
        +jumlahData);
    }

    //fungsi menampilkan data
    static void tampilData() {
        System.out.println(" === Data Semua Pendaftar Magang === ");

        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.println("No | Nama \t\tNIM\t\tProdi\t\tPerusahaan Magang\tSemester\tStatus");

        for (int i = 0; i<jumlahData; i++) {
            System.out.println(
            (i+1) + "\t" +
            dataMagang[i][0] + "\t" +
            dataMagang[i][1] + "\t" +
            dataMagang[i][2] + "\t\t" +
            dataMagang[i][3] + "\t" +
            dataMagang[i][4] + "\t\t" +
            dataMagang[i][5]
            );
        }
    }

    //fungsi untuk mencari data berdasarkan prodi 
    static void cariPendaftar () {
        System.out.println("Masukkan Program Studi: ");
        String cariProdi = sc.nextLine();

        System.out.println(" == Hasil Pencarian == ");
        boolean ketemu = false;

        System.out.println("No\tNama\t\tNIM\t\tProdi\t\tPerusahaan\tSemester\tStatus");

        for (int i = 0; i < jumlahData; i++) {

            if (dataMagang[i][2].equalsIgnoreCase(cariProdi)) {
                ketemu = true;
                System.out.println(
                (i+1) + "\t" +
                dataMagang[i][0] + "\t\t" +
                dataMagang[i][1] + "\t\t" +
                dataMagang[i][2] + "\t\t" +
                dataMagang[i][3] + "\t" +
                dataMagang[i][4] + "\t\t" +
                dataMagang[i][5]
                );
                
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada pendaftar dengan Program Studi tersebut");
        }

    }


    //fungsi hitung status
    static void hitungStatus() {
        int diterima = 0, menunggu = 0, ditolak = 0; 

        for (int i = 0; i<jumlahData; i++) {
            String status = dataMagang[i][5];

            if (status.equalsIgnoreCase("Diterima")) diterima++;
            else if (status.equalsIgnoreCase("Menunggu")) menunggu++;
            else if (status.equalsIgnoreCase("Ditolak")) ditolak++;
        }

        System.out.println("Diterima: " +diterima);
        System.out.println("Menunggu: " +menunggu);
        System.out.println("Ditolak: " +ditolak);

    }
    public static void main(String[] args) {

        int menu;

        do { 
            System.out.println(" === Sistem Pendaftaran Magang Mahasiswa === ");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Kasus");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                InputData();
            } else if (menu == 2){
                tampilData();
            } else if (menu == 3) {
                cariPendaftar();
            } else if (menu == 4) {
                hitungStatus();
            } else if (menu == 5) {
                System.out.println("Keluar");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (menu !=5);
    }
  
}