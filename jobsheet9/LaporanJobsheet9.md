# Laporan Praktikum Dasar Pemrograman Jobsheet 9: Array 1

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## Percobaan 1 : Mengisi Elemen Array 
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
- Akan terjadi error karena kita mendeklarasikan bilangan menggunakan tipe data integer bukan double, jadi tidak bisa diubah menjadi 5.0 atau 7.5
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
pada saat deklarasi array.
- Berikut hasil modifikasi setelah melakukan inisialisasi elemen array:
- <img width="410" height="157" alt="image" src="https://github.com/user-attachments/assets/3f9019cf-b61c-4405-9427-c6035d5d0144" />

3. Ubah statement pada langkah No 4 menjadi seperti berikut: 
- <img width="292" height="70" alt="image" src="https://github.com/user-attachments/assets/ebbfe1f9-9d5c-4031-9af6-54004d7b8d27" />

Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
- akan menampilkan seluruh array dari indeks 0-3, masing masing di baris baru
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
dari program? Mengapa demikian?
- karena kondisi perulangan menggunakan i<4 maka indeks yang bisa diakses 0-3. sehingga jika menggunakan i<=4 akan terjadi error karena indeks yang bisa diakses hanya 0-3

## Percobaan 2 : Studi Kasus Nilai Mahasiswa SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array 
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
- <img width="496" height="83" alt="image" src="https://github.com/user-attachments/assets/256b4dc7-9053-4d73-ab0a-f9e98680c990" />

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
- <img width="820" height="432" alt="image" src="https://github.com/user-attachments/assets/651d708e-5692-4aa3-97e2-04c896d7325e" />

- Berikut hasil output program:
- <img width="339" height="522" alt="image" src="https://github.com/user-attachments/assets/49bf76c8-3d5c-43d2-af58-9efcdb08be71" />

## Percobaan 3:  Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Aritmatika terhadap Elemen Array
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).
- Berikut hasil modifikasi program:
- <img width="763" height="256" alt="image" src="https://github.com/user-attachments/assets/09f3c1ed-880d-4d87-ab90-5dbd9ec9cdcc" />

- Berikut Output program:
- <img width="477" height="231" alt="image" src="https://github.com/user-attachments/assets/259bf490-dc9a-48f7-b177-b354666d2720" />

2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan
output seperti gambar.
- Berikut hasil modifikasi program:
- <img width="532" height="586" alt="image" src="https://github.com/user-attachments/assets/d896c5a8-cac3-435d-9170-d9073dbd826a" />

- Berikut Output program:
- <img width="835" height="579" alt="image" src="https://github.com/user-attachments/assets/4b63184a-81f8-469a-8cfd-1520cd13038b" />

## Percobaan 4: Searching
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
atas.
- untuk menghentikan perulangan saat kondisi if(key==arrNilai[i]) terpenuhi, dan langsung keluar dari loop menggunakan break
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima
input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin
dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. 
- Berikut hasil modifikasi program:
- <img width="436" height="136" alt="image" src="https://github.com/user-attachments/assets/3c47a2a2-6ffc-4b1e-b86e-06f0e771b9f6" />

- Berikut Output program:
- <img width="440" height="136" alt="image" src="https://github.com/user-attachments/assets/efad430d-3afc-4d03-812d-3898ee112050" />

3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan
"Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. 
- Berikut hasil modifikasi output program:
- <img width="762" height="734" alt="image" src="https://github.com/user-attachments/assets/50f297b9-1e6f-44fa-bde7-c923f490fff4" />
 

## TUGAS 1

## 1. Program untuk menyimpan dan mengelola nilai mahasiswa
- Berikut hasil program:
- <img width="376" height="223" alt="image" src="https://github.com/user-attachments/assets/bad25145-a14c-4350-bb75-dbe3f92a5d46" />

- Berikut Output yang dihasilkan:
- <img width="681" height="698" alt="image" src="https://github.com/user-attachments/assets/86b8622e-5d1a-49f8-948e-72393b6b0aca" />


## 2. Program untuk mengelola makanan dan minuman di sebuah cafe
- Berikut hasil program:
- <img width="405" height="312" alt="image" src="https://github.com/user-attachments/assets/a47e0d31-787a-4e8c-b0c1-d213e9de55f0" />

- Berikut Output yang dihasilkan:
- <img width="1195" height="576" alt="image" src="https://github.com/user-attachments/assets/52f49dd2-f145-4d23-97bb-b998b635e2c2" />


## 3. Program ynag memungkin user untuk memesan makaanan yang ada di menu dan menampilkan apakah menu tersaedia/tidak
- Berikut hasil program:
- <img width="437" height="217" alt="image" src="https://github.com/user-attachments/assets/19efaccc-c9d7-4e57-820a-376a829febe4" />

- Berikut Output yang dihasilkan:
- ![Uploading image.png…]()
 
