# Laporan Praktikum Dasar Pemrograman Jobsheet 12: Fungsi Rekursif

<h4>Nama : Aylafada Syakira<h4>
<h4>NIM : 254107020116<h4>
<h4>Kelas : TI-1C<h4>

## Percobaan 1 
1. Apa yang dimaksud dengan fungsi rekursif?
- fungsi rekursif adalah perulangan dengan struktur seleksi (IF-ELSE) dan pemanggilan fungsi dirinya sendiri
2. Pada Percobaan 1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!
- Sama, fungsi rekursif akan berhenti saat base case terpenuhi. sedangkan fungsi iteratif akan berhenti saat kondisi pengulangan bernilai false 
- fungsi rekursif: pengulangan tanpa henti jika base case tidak terpenuhi. fungsi iteratif: pengulangan tanpa henti jika kondisi pengulangan selalu benar 

## Percobaan 2 
pict: 2
1. Pada Percobaan 2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
- sampai base case terpenuhi
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32
- Berikut kode program yang ditambahkan: 

## Percobaan 3
(2)
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
- base case: ```(tahun == 0)```
recursion call: ````(1.11 * hitungLaba(saldo, tahun-1))````
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)
- fase ekspansi: 
```
1.11 * hitungLaba(100000, 2); //tahun ke-3
1.11 * hitungLaba(100000, 1); //tahun ke-2
return 100000; //tahun ke-1
```
- fase substitusi:
```
1.11 * 100000; //tahun ke-1
1.11 * 111000; //tahun ke-2
1.11 * 123210; //tahun ke-1
= 136763,1;
```

## Tugas 
Berikut program yang menimplementasikan fungsi rekrusif dan fungsi iteratif untuk menghitung dan mencetak total nilai: 
- 
Berikut adalah output program: 
- 