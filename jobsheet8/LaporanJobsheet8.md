# Laporan Praktikum Dasar Pemrograman Jobsheet 8: Perulangan 2

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## Percobaan 1 : Review Perulangan 1

1. Jika pada perulangan for, inisialisasi i = 1 diubah menjadi i = 0, apa akibatnya? Mengapa bisa demikian?
- perulangan akan dimulai dari 0. Sehinggga ketika menginputkan n = 5, perulangan akan terjadi 6 kali. 
2. Jika pada perulangan for, kondisi i <= n diubah menjadi i < n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda?
- jika input n = 5 maka perulangan akan terjadi 4 kali. karena i kurang dari 5, maka angka 5 nya tidak dijalankan
3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?
- perulangan tidak akan dijalankan sama sekali. karena dari awal 1 tidak lebih besar dari sama dengan 5, maka loop tidak akan dijalankan
4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?
- akan terjadi infinite loop, karena i berkurang terus tiap iterasi dan kondisi i<=5 akan terus terpenuhi
5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola
outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?
- karena i += 2, perulangan lompat dua angka sekali jalan, akibatnya loop hanya berjalan 3 kali, bukan 6 kali

## Percobaan 2: Bintang Persegi
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
- hasilnya akan mencetak satu baris bintang lebih banyak. Karena perulangan dijalankan satu kali lebih banyak yaitu dari 0 sampai n, bukan 1 sampai n.
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
- hasilnya akan mencetak satu kolom bintang lebih banyak. Karena perulangan dijalankan satu kali lebih banyak yaitu dari 0 sampai n, bukan 1 sampai n.
3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?
- outer loop akan mengatur ganti baris, sedangkan inner loop akan mengatrur kolom 
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
- agar dapat menambahkan baris baru. tanpa System.out.println(); tidak akan terjadi ganti baris baru, jadi semua hasil inner loop akan terbentuk di satu garis

## Percobaan 3: Bintang Segitiga
1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan
berikut?
- tidak, karena tidak ada perintah untuk mengganti baris baru yaitu System.out.println();
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan
setiap bagian yang perlu diperbaiki/ditambahkan.
-  perintah yang perlu ditambahkan adalah System.out.println(); Karena System.out.println(); berfungsi untuk menambahkan baris baru
4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set
ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?
- i mengatur baris keberapa ynag sedang dicetak, setiap outer loop berati satu baris segitiga
j akan mengatur jumlah bintang pada setiap baris
- kalau tidak di reset, maka nilainya akan terus naik ke nilai sebelumnya, jadi inner loop tidak akan bekerja sesuai seperti yang diinginkan

## Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok
1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan
mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.
- fungsi variabel totalNilai adalah menyimpan jumlah nilai dari 5 penilai dalam 1 kelompok. kalau diluar loop nilainya akan menumouk dari kelompok sebelumnya, membuat rata-ratanya salah
2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut
Berikut hasil modifikasi untuk mencari kelompok dengan rata-rata nilai tertinggi beserta nomor kelompoknya: 
- 

## TUGAS

### 1.  Program untuk menghitung dan menampilkan jumlah kuadrat
Berikut hasil program: 
Berikut hasil output program: 

### 2. Program untuk mencetak tampilan persegi angka
Berikut hasil program: 
Berikut hasil output program: 

### 3. Program aktivitas penjualan setiap cabang kafe 
Berikut hasil program: 
Berikut hasil output program: 
