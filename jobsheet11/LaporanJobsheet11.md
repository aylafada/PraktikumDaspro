# Laporan Praktikum Dasar Pemrograman Jobsheet 9: Array 1

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
(pict: 5, 6, 7, 8)
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
- tidak. jika ingin menampilkan indeks kedua atau yang lain terlebih dahulu juga bisa, tetapi indeks harus valid. jika mengisi misal indkes [5], padahal indeks hanya [4] maka akan error
2. Mengapa terdapat null pada daftar nama penonton?
- karena pada indeks baris [3] dan kolom [1] atau elemen array tidak diisi
4. Jelaskan fungsi dari penonton.length dan penonton [0].length! Apakah penonton[0].length, penonton[1] length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
- fungsi penonton.length adalah panjang baris dari variabel penonton, sedangkan penonton[0].length adalah panjang kolom dari indeks penonton[0]
- Ya, memiliki nilai yang sama karena dari awal sudah di deklarasikan bahwa panjang baris ada [4] dan kolom [2]
5. Berikut modifikasi pertanyaan 4 menggunakan for loop: 
- 
6. Berikut modifikasi pertanyaan 5 menggunakan for each loop: 
- 
7. Berikut hasil menampilkan nama penonton pada baris ke-3
- 
8. Berikut hasil modifikasi nomor 7 mengguankan foreach loop
- 
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
- for each loop: pola pengambilannya 1 per 1 dari depan sampai ke belakang (urut). for each loop tidak bisa mengetahui atau mengubah indeks secara langsung, tidak cocok jika ingin memodifikasi elemen tertentu berdasarkan posisi.. teteapi lebih sederhana dan mudah dibaca
for loop: lebih fleksibel karena indeks ditulis lebih spesifik, misal i++ atau i--, jadi bisa mengakses indeks dan mengubah elemen berdasarkan posisinya.
11. Berapa indeks baris maksimal untuk array penonton?
- jumlah baris: 4, indeks max: 3
12. Berapa indeks kolom maksimal untuk array penonton?
- jumlah kolom: 2, indeks max: 1
13. Apa fungsi dari String.join()?
- untuk menggabungkan beberapa string menjadi satu string dengan pemisah tertentu

## Percobaan 2: Memanfaatkan Scanner dan Perulangan untuk Input dan Output pada Array 2 Dimensi
(pict: 2, 3, 4)
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0 Jelaskan!
- tidak, elemen array bisa dimulai dari inders manapun, asal tidak melebihi indeks yang telah ditentukan
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
Menu 1: Input data penonton
Menu 2: Tampilkan daftar penonton
Menu 3: Exit
- Berikut modifikasi kode program: 

3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia
- Berikut modifikasi kode program:
- Berikut output program: 

4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali
- Berikut modifikasi kode program
- Berikut output program:

## Percobaan 3: Array 2 Dimensi dengan Length Baris Berbeda
2. Apa fungsi dari Arrays.toString()?
- digunakan untuk mengubah isi array menjadi string agar bisa ditampilkan dengan rapi
3. Apa nilai default untuk elemen pada array dengan tipe data int?
- nilai default untuk elemen array int adalah 0 
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?
- tidak bisa, panjang array tidak dapat diubah setelah dibuat

## Percobaan 4: Studi Kasus SIAKAD
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi
kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah
yang dinamis.
- Berikut hasil modifikasi kode program SIAKAD: 
- Berikut Output program: 

## Tugas 
1. Implementasikan flowchart yang telah dibuat pada latihan Dasar Pemrograman
(Teori) ke dalam kode program Java. 
- Berikut kode program: 
- Berikut output program: 




