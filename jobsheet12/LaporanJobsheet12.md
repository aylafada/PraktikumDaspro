# Laporan Praktikum Dasar Pemrograman Jobsheet 12: Fungsi 1

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## Percobaan 1: Membuat Fungsi Tanpa Parameter
(pict: 2)
1. Apakah fungsi tanpa parameter harus bertipe void?
- Tidak, tetapi harus menggunakan void ketika fungsi tersebut tidak mengembalikan nilai 
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
- Bisa. Berikut program agar dapat menampilkan daftar menu tanpa menggunakan fungsi: 
- 
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
- keuntungannya adalah program lebih efisien, mudah untuk di baca, bisa dipanggil berkali kali tanpa copy paste, dan lebih rapi
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
a. Program mulai dari main()
b. baris Menu() dieksekusi
c. Program menjalanlan semua perintah output dalam fungsi
d. Setelah selesai, eksekusi kembali ke main()

## Percobaan 2: Membuat Fungsi Dengan Parameter
(pict: 6, 7)
1. Apakah kegunaan parameter di dalam fungsi?
- fungsi memerlukan parameter ketika fungsi tersebut membutuhkan data yang asalnya dari luar fungsi untuk diolah dalam fungsi
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
- karena membutuhkan data pelanggan dan isMember untuk mengecek apakah pelanggan mendapat diskon atau tidak 
3. Apakah parameter sama dengan variabel? Jelaskan.
- sama, parameter adalah variabel khusus milik fungsi
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
- parameter isMember berfungsi untuk mengecek apakah pelanggan adalah member atau tidak. Jika isMember bernilai true maka output menampilkan bahwa pelanggan adalah member dan mendapatkan diskon, sedangkan jika bernilai false maka tidak akan menampilkan apa apa
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
- maka akan muncul error
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
- Berikut hasil modifikasi program: 
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
- Berikut adalah perintah pemanggilan program menggunakan fungsi menu yang benar: 
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
- iya, program jadi lebih fleksibel, lebih mudah dipahami, dan kode tidak perlu ditulis berulang ulang

## Percobaan 3: Membuat Fungsi dengan Nilai Kembalian 
(pict: 1(2), 3, 4)
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
- fungsi membutuhkan return value ketika program butuh hasil perhitungan yang akan dipakai lagi. dan tidak membutuhkan nilai kembalian (void) jika hanya menampilkan sesuatu, tidak menghitung. 
- Berikut contoh return value pada percobaan 3: 
- Berikut contoh yang tidak memerlukan return value pada percobaan 3:
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
- tipe data nilai kembaliannya adalah integer. menggunakan int pada pilihanMenu dan jmulahPesanan karena total harga adalah bilangan bulat
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
- Berikut hasil modifikasi kode program: 
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 
- Berikut hasil modifikasi kode program

## Percobaan 4: Fungsi Varargs
(pict: 2)
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
- karena varargs(...) dipakai ketika jumlah data yang dikirim tidak pasti dan bisa mengirim banyak nama sekaligus
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
- Berikut hasil modifikasi program: 

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
- tidak bisa, hanya bisa 1 varargs per method dan harus di parameter terakhir
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
- tidak error, teteapi tidak ada yang dicetak di dalam loop. Outputnya hanya ```Daftar nama pengunjung: ```

## Percobaan 5: Pembuatan Kode Program, dengan Fungsi versus Tanpa Fungsi
(pict: )
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
a. program masuk ke main()
b. program membuat objek Scanner untuk input panjang, lebar, tinggi
c. user memasukkan panjang, lebar, tinggi 
d. program memanggil fungsi L = hitungLuas(p, l)
e. fungsi menghitung p*l
f. program menampilkan luas "Luas persegi adalah L" 
g. program memanggil vol = hitungVolume(t, p, l)
h. volume dihitung = luas * tinggi
i. program menampilkan volume 
j. selesai
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
a. user input 4, 3, 5
b. program memanggil hitungLuas(4,3) 
c. program memanggil hitungVolume (5, 4, 3)
d. output tampil: 12x5=60
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
- output dari program diatas adalah: 

- alur: 
a. main memanggil Jumlah(1,1) hasilnya 2 
b. Lalu manggil TampilJumlah (2,5)
c. di dalam TampilJumlah, dihitung Jumlah (2, 5) hasilnya 7
d. TampilHinggaKei (7) mencetak angka 1-7
e. selesai 
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
- fungsi butuh data dari luar agar bisa menghitung sesuatu. fungsi tanpa parameter jika fungsi tidak butuh data dari luar, misalnya hanya menampilkan menu
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
- menggunakan parameter jika nilai yang diproses bisa berbeda beda tergantung user. contoh di program: hitungLuas(p, l) dan hitungVolume (t, p, l) ini tidak bisa tanpa parameter karena butuh nilai nilai tersebut
- tidak menggunakan parameter jika fungsinya hanya melakukan hal yang sama setiap dipanggil. contohnya fungsi untuk menampilkan garis pemisah, judul menu, reset atmpilan, dll karena nilainya tidak ditampilkan lagi di main 
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
- fungsi harus memiliki return value kalau menghasilkan perhitungan. contoh hitungLuas() itu mengembalikan luas, dan hitungVolume() itu mengembalikan volume 
- fungsi tidak perlu return value jika hanya menampilkan output. dan fungsi ini menggunakan void karena tidak menghitung apapun, tidak mengembalikan nilai, dan hanya menampilkan sesuatu 

## Tugas 
1. Berikut program untuk mengitung volume kubus dan luas permukaan kubus: 
- 
- Berikut output program: 
- 
2. Berikut program untuk menginputkan nilai mahasiswa: 
-
- Berikut output program: 
- 
3. Berikut program untuk melihat data penjualan cafe:
- 
- Berikut output program: 
-

