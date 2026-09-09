# Minpro-1-PBO-SistemManajemenTypesettingKomik

## Deskripsi Singkat Program
Program ini merupakan Sistem Manajemen Typesetting Komik berbasis konsol Java yang dirancang untuk mengelola data proyek komik, typesetter yang bertugas, nomor chapter, serta status pengerjaannya secara CRUD (Create, Read, Update, Delete).

## Penjelasan Alur Program
1. **Entry Point**: Program dijalankan dari kelas utama `Minpro1pboSistemManajemenTypesettingKomik`.
2. **Menu Utama**: Pengguna disajikan opsi menu bertingkat (1-5) menggunakan kontrol *Do-While* dan *Switch-Case*.
3. **Tambah Data (Create)**: Pengguna memasukkan detail Komik, Typesetter, Chapter, dan Status Pengerjaan yang kemudian disimpan ke dalam `ArrayList<ProyekTypeset>`.
4. **Tampilkan Data (Read)**: Program melakukan iterasi (*for-loop*) pada `ArrayList` untuk menampilkan seluruh daftar proyek typesetting.
5. **Update Data (Update)**: Pengguna memilih nomor urut proyek untuk memperbarui chapter dan status pengerjaan.
6. **Hapus Data (Delete)**: Pengguna memilih nomor urut proyek yang ingin dihapus dari daftar.
7. **Keluar**: Memilih opsi 5 akan menghentikan perulangan program.

## Penjelasan Letak Penerapan Nilai Tambah
1. **Access Modifier**: Atribut pada kelas entitas (`Komik`, `Typesetter`, `ProyekTypeset`) dibuat dengan modifier `private` untuk menyembunyikan data secara langsung.
2. **Encapsulation**: Menggunakan metode `Getter` dan `Setter` pada seluruh kelas entitas untuk mengakses dan mengubah variabel `private`.
3. **Validasi Input**:
   - Memvalidasi input pilihan menu dan chapter agar program tidak *crash* jika user memasukkan non-angka via `scanner.hasNextInt()`.
   - Mencegah pengisian nomor chapter yang bernilai nol atau negatif (`chapter <= 0`).
