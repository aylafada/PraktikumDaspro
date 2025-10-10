# Laporan Praktikum Dasar Pemrograman Jobsheet 5 Pemilihan

<h3>Nama : Aylafada Syakira<h3>
<h3>NIM : 254107020116<h3>
<h3>Kelas : TI-1C<h3>

## 2.1 Percobaan 1: Penerapan IF-ELSE untuk Mencetak KRS 

### Pertanyaan Percobaan 2
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional? 
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya? 
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE! 
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1” 

### Jawaban Percobaan 2.1
1. Karena kondisi yang dicek sudah berupa boolean, dimana boolean bernilai true or false. Contoh operator relasional adalah ==, !=, <, >
2. Ketika mengisi nilai false, tidak terdapat output, karena false berarti kondisi tidak terpenuhi, dan karena tidak ada struktur else, tidak ada tindakan lain yang dilakukan.
3. Berikut hasil dari modifikasi Percobaan 1:
   <img width="994" height="408" alt="Screenshot 2025-10-10 105202" src="https://github.com/user-attachments/assets/8b41a276-8edd-41d4-9c9a-0c15aee8c624" />



## Percobaan 2.2: SWITCH-CASE untuk Mencetak KRS

### Pertanyaan Percobaan 2.2
1. Apa fungsi dari sintaks break? 
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE? 
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dariprogram cetak KRS menggunakan struktur SWITCH-CASE yang telah 
dibuat ke dalam bentuk IF-ELSE IF-ELSE. 
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2

### Jawaban Percobaan 2.2
1. Break adalah perintah yang digunakan untuk menghentikan jalannya program di dalam suatu blok, seperti pada switch-case sebelum mencapai strutur akhir tersebut. 
2. Default digunakan untuk menangani kasus yang tidak cocok dengan case manapun dalam switch.
3. Berikut hasil Modifikasi percobaan 2:
   <img width="948" height="796" alt="Screenshot 2025-10-10 105047" src="https://github.com/user-attachments/assets/83da8151-ff05-445b-902e-d1e1105b1ea0" />


## Percobaan 3: Nested IF untuk Mencetak Syarat Ujian Skripsi

### Pertanyaan Percobaan 3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian? 
2. Jelaskan maksud dari potongan kode berikut! 
if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi! 

### Jawaban Percobaan 3
1. Jika mahasiswa menjawab "No", maka program akan langsung mengeksekusi blok else yang berisi pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen". Karena syarat bebas kompen adalah syarat utama atau pertama yang harus dipenuhi. Kalau sudah gagal di awal, maka pemeriksaan log bimbingan menjadi tidak relevan lagi.
2. Potongan kode ini digunakan untuk memeriksa apakah mahasiswa telah memenuhi syarat log bimbingan, yaitu:
Log bimbingan Pembimbing 1 harus minimal 8 kali
Log bimbingan Pembimbing 2 harus minimal 4 kali
Jika kedua syarat ini terpenuhi, maka mahasiswa dianggap telah memenuhi syarat log bimbingan dan boleh mendaftar ujian skripsi.
3. Berikut alur pemeriksaan syarat mahasiswa dari awal sampai akhir:
    1. Mahasiswa ditanya: Apakah sudah bebas kompen?
    2. Jika jawabannya "Ya" (tidak case sensitive, karena pakai equalsIgnoreCase("Ya")):
    3. Maka lanjut ke pemeriksaan log bimbingan:
    Jika bimbinganP1 >= 8 dan bimbinganP2 >= 4 →
    Output: "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi"
    4. Jika bimbinganP1 < 8 dan bimbinganP2 < 4 →
    Output: "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali"
    5. Jika bimbinganP1 < 8 saja →
    Output: "Gagal! Log bimbingan P1 belum mencapai 8 kali"
    6. Jika bimbinganP2 < 4 saja →
    Output: "Gagal! Log bimbingan P2 belum mencapai 4 kali"
    7. Jika jawabannya selain "Ya" (misalnya: "No", "Tidak", dll):
    Maka langsung keluar pesan: "Gagal! Mahasiswa masih memiliki tanggungan kompen."

## Tugas 1 
Buka kembali file ifCetakKRSNoPresensi.java, tambahkan baris baru di dalam fungsi main 
untuk melakukan transformasi program cetak KRS hasil modifikasi menggunakan struktur 
IF-ELSE yang telah dibuat ke dalam bentuk Ternary Operator! Commit dan push program 
Anda ke Github dengan pesan “Tugas 1” 
- Berikut hasil modifikasi dalam bentuk Ternary Operator:
    <img width="1334" height="552" alt="Screenshot 2025-10-10 105317" src="https://github.com/user-attachments/assets/92035ab7-b53f-4175-b68b-ab96bd952170" />


## Tugas 2 
Implementasikan flowchart tersebut ke dalam kode program Java dengan struktur 
pemilihan IF-ELSE! Commit dan push program Anda ke Github dengan pesan “Tugas 2”
- Berikut implementasi flowchart soal nomor dua:
  <img width="801" height="591" alt="Screenshot 2025-10-10 105545" src="https://github.com/user-attachments/assets/778555db-8be4-414a-bf0f-89ab823be5e8" />



## Tugas 3
Implementasikan flowchart yang telah Anda buat untuk Latihan pada Tugas pertemuan 
5 Matakuliah Dasar Pemrograman terkait sistem perpustakaan dan akses WIFI kampus 
ke dalam kode program! Commit dan push program Anda ke Github dengan pesan 
“Tugas 3” 
- Berikut implementasi flowchart pada Tugas pertemuan 5:
  <img width="1068" height="910" alt="Screenshot 2025-10-10 110556" src="https://github.com/user-attachments/assets/4c28c969-effe-4139-aade-c206881beff2" />


