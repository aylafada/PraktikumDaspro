# Laporan Praktikum Dasar Pemrograman Jobsheet 9: Array 1

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

(add picture: 2, 3)
## Percobaan 1 : Mengisi Elemen Array 
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
- Akan terjadi error karena kita mendeklarasikan bilangan menggunakan tipe data integer bukan double, jadi tidak bisa diubah menjadi 5.0 atau 7.5
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
pada saat deklarasi array.
- Berikut hasil modifikasi setelah melakukan inisialisasi elemen array: 
3. Ubah statement pada langkah No 4 menjadi seperti berikut: 
- 
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
- akan menampilkan seluruh array dari indeks 0-3, masing masing di baris baru
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
dari program? Mengapa demikian?
- karena kondisi perulangan menggunakan i<4 maka indeks yang bisa diakses 0-3. sehingga jika menggunakan i<=4 akan terjadi error karena indeks yang bisa diakses hanya 0-3

(add picture: 1, 4)
## Percobaan 2 : Studi Kasus Nilai Mahasiswa SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array 
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
- 
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
- nilaiAkhir.length otomatis menyesuaikan dengan ukuran array, jadi kalau kapasitas array berubah, program tetap aman
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
- nilaiAkhir.length adalah jumlah elemen dalam array nilaiAkhir, yang akan memastikan bahwa indeks i tidak melabihi batas array
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
Jalankan program dan jelaskan alur program!
- 1. program melakukan perulangan dari 1=0 hingga i < nilaiAkhir.length
2. program memeriksa apakah nilaiAkhir[ i ] > 70
3. jika kondisi terpenuhi maka outputnya "Mahasiswa ke-i lulus!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus.
- Berikut hasil modifikasi program: 
- Berikut hasil output program: 

(add picture: 1, 2)
## Percobaan 3:  Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Aritmatika terhadap Elemen Array
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).
- Berikut hasil modifikasi program: 
- Berikut Output program: 
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan
output seperti berikut ini:
- Berikut hasil modifikasi program: 
- Berikut Output program: 

(add picture: 2, 3)
## Percobaan 4: Searching
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
atas.
- untuk menghentikan perulangan saat kondisi if(key==arrNila[i]) terpenuhi, dan langsung keluar dari loop menggunakan break
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima
input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin
dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. 
- Berikut hasil modifikasi program: 
- Berikut Output program: 
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan
"Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.
- Berikut hasil modifikasi program: 
- Berikut Output program: 

## TUGAS 1

## 1. Program untuk menyimpan dan mengelola nilai mahasiswa
- Berikut hasil program: 
- Berikut OUtput yang dihasilkan: 

## 2. Program untuk mengelola makanan dan minuman di sebuah cafe
- Berikut hasil program: 
- Berikut OUtput yang dihasilkan: 

## 3. Program ynag memungkin user untuk memesan makaanan yang ada di menu dan menampilkan apakah menu tersaedia/tidak
- Berikut hasil program: 
- Berikut OUtput yang dihasilkan: 