# Laporan Praktikum Dasar Pemrograman Jobsheet 9: Array 1

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
- tidak. jika ingin menampilkan indeks kedua atau yang lain terlebih dahulu juga bisa, tetapi indeks harus valid. jika mengisi misal indkes [5], padahal indeks hanya [4] maka akan error
2. Mengapa terdapat null pada daftar nama penonton?
- karena pada indeks baris [3] dan kolom [1] atau elemen array tidak diisi
4. Jelaskan fungsi dari penonton.length dan penonton [0].length! Apakah penonton[0].length, penonton[1] length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
- fungsi penonton.length adalah panjang baris dari variabel penonton, sedangkan penonton[0].length adalah panjang kolom dari indeks penonton[0]
- Ya, memiliki nilai yang sama karena dari awal sudah di deklarasikan bahwa panjang baris ada [4] dan kolom [2]
5. Berikut modifikasi pertanyaan 4 menggunakan for loop: 
- <img width="977" height="134" alt="image" src="https://github.com/user-attachments/assets/a4d8903d-1b56-4704-abcd-4a02d0139cc0" />

6. Berikut modifikasi pertanyaan 5 menggunakan for each loop: 
- <img width="636" height="139" alt="image" src="https://github.com/user-attachments/assets/84097b4e-4fd4-472a-a277-a776289a50fa" />

7. Berikut hasil menampilkan nama penonton pada baris ke-3
- <img width="513" height="130" alt="image" src="https://github.com/user-attachments/assets/437dce22-fa6f-4603-9ec3-aa965127e405" />

8. Berikut hasil modifikasi nomor 7 mengguankan foreach loop
- <img width="739" height="129" alt="image" src="https://github.com/user-attachments/assets/e7bae9a8-72eb-4b25-98b2-afc2de1c3c0d" />

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
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0 Jelaskan!
- tidak, elemen array bisa dimulai dari inders manapun, asal tidak melebihi indeks yang telah ditentukan
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
Menu 1: Input data penonton
Menu 2: Tampilkan daftar penonton
Menu 3: Exit
- Berikut modifikasi kode program: 
- <img width="595" height="217" alt="image" src="https://github.com/user-attachments/assets/3750dbc4-3918-4c8e-845c-4d0b13c4fb46" />

3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia
- Berikut modifikasi kode program:
- <img width="625" height="138" alt="image" src="https://github.com/user-attachments/assets/19c69d5c-3d5b-4a55-a2e6-a57ab399af24" /> 

4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali
- Berikut modifikasi kode program:
- <img width="761" height="254" alt="image" src="https://github.com/user-attachments/assets/1cec3419-a640-4871-9d70-6ea68f598467" />

- Berikut output program:
- <img width="439" height="213" alt="image" src="https://github.com/user-attachments/assets/b951cbf1-9329-4b90-9d74-7b832d2a1a1f" />


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
- <img width="675" height="321" alt="image" src="https://github.com/user-attachments/assets/ba54691d-e430-4b7c-bff8-80b9b05e4474" />

- Berikut Output program:
- <img width="285" height="360" alt="image" src="https://github.com/user-attachments/assets/352618b6-f208-4560-803e-692de2079a80" />


## Tugas 
1. Implementasikan flowchart yang telah dibuat pada latihan Dasar Pemrograman
(Teori) ke dalam kode program Java. 
- Berikut kode program:
- <img width="679" height="755" alt="image" src="https://github.com/user-attachments/assets/ae088e42-bc6c-41bf-af09-796088a657ef" />

- Berikut output program:
- <img width="365" height="485" alt="image" src="https://github.com/user-attachments/assets/dc9f2034-481f-42ff-9847-9e7f091688cb" />






