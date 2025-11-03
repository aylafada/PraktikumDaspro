# Laporan Praktikum Dasar Pemrograman Jobsheet 7 Perulangan 1

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
- Berikut merupakan komponen perulangan FOR pada kode program percobaan 1: 
![alt text](image.png)

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
- variabel tertinggi diinisialisasi 0 karena tidak ada nilai mahasiswa yang lebih kecil dari 0, agar ketika ada nilai yang lebih dari 0, program bisa langsung memperbarui nilai tertinggi tersebut. Sedangkan variabel terendah diinisialisasi 100 karena dianggap tidak ada nilai yang lebih tinggi dari 100, dan supaya ketika ada nilai yang lebih kecil dari 100, program dapat menggantinya sebagai nilai terendah yang baru.
- yang akan terjadi ketika nilai terendah diinisialisasi 0 dan nilai tertinggi = 100 adalah nilai tertinggi akan tetap 100 meskipun pengguna memasukkan nilai yang lebih kecil, dan nilai terendah akan tetap 0 meskipun pengguna memasukkan nilai yang lebih besar. Berikut adalah hasil program ketika insialisasi variabel tertinggi dan terendah dibalik:
- ![alt text](<Screenshot 2025-10-24 095842 - Copy.png>)

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
- ![alt text](image-1.png)
- Kode tersebut akan bekerja berulang setiap kali pengguna memasukkan nilai yang baru. Variabel tertinggi akan menyimpan nilai terbesar, dan variabel terendah akan menyimpan nilai terkecil dari seluruh input.

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!
- Berikut adalah program hasil modifikasi: 
- ![alt text](image-2.png)
- Berikut adalah output program: 
- ![alt text](image-3.png)

## 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
a. nilai < 0 || nilai > 100
- Berfungsi untuk memeriksa apakah nilai yang dimasukkan berada di luar rentang 0-100. Jika kondisi benar, berarti nilai tidak valid
b. continue
- Berfungsi untuk melewati sisa perintah dalam satu perulangan dan langsung melanjutkan ke iterasi berikutnya dari loop

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
- Karena berfungsi untuk menambah nilai setelah siklus perulangan selesai dijalankan. Dengan cara ini, setiap iterasi akan memproses data secara berurutan mulai dari mahasiswa ke-1, ke-2, dan seterusnya.
- Jika i++ dituliskan di awal perulangan, maka nilai penghitung akan bertambah sebelum proses input dan pemrosesan dilakukan, sehingga perulangan akan dimulai dari mahasiswa ke-2, bukan ke-1, dan jumlah iterasi yang dilakukan menjadi kurang satu kali (mahasiswa pertama tidak diproses).

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
- 19 kali

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
- Berikut program hasil modifikasi: 
- ![alt text](image-5.png)
- Berikut hasil output program yang telah dimodifikasi: 
- [alt text](image-4.png)

## 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
- 1 kali, karena do while menjalankan kode di dalam do dulu sebelum cek kondisi 
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
- pada saat nama pelanggan yang dimasukkan adalah "batal"
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
- while (true) membuat loop jadi infinite loop sampai ada perintah untuk berhenti, atau supaya program terus meminta input nama pelanggan sampai user mengetik "batal"
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?
- karena do while menjalankan kode di dalam loop terlebih dahulu baru mengecek kondisinya, jadi tidak perlu memberi nilai awal atau update di luar loop. Selama break belum terpanggil, program akan terus berjalan.

## Tugas
1. Berikut hasil program menghitung total tiket yang terjual dan total harga penjualan selama satu hari: 
- ![alt text](image-6.png)
Berikut hasil output program: 
- ![alt text](image-7.png)
2. Berikut hasil program untuk menghitung total pembayaran parkir dari beberapa kendaraan: 
- ![alt text](<Screenshot 2025-10-27 202943.png>)
Berikut hasil output program: 
- ![alt text](image-8.png)
