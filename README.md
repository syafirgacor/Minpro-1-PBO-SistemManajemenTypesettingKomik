# Minpro 1 PBO - Sistem Manajemen Typesetting Komik

Aplikasi CLI (*Command Line Interface*) berbasis Java yang dirancang untuk mengelola dan memantau proyek *typesetting* komik secara terstruktur menggunakan prinsip Pemrograman Berbasis Objek (PBO).

---

## 📸 Dokumentasi & Alur Program

### 1. Tampilan Menu Utama & Menampilkan Data (Read)
[Menu Utama dan Read Data]<img width="1040" height="452" alt="Screenshot 2026-09-10 151715" src="https://github.com/user-attachments/assets/1198cd91-2e99-48a8-aa58-c52a074d5601" />


**Penjelasan:**
* Saat aplikasi pertama kali dijalankan, sistem akan menginisialisasi beberapa *dummy data* awal.
* Pengguna disajikan Menu Utama yang berisi 5 opsi (Tambah, Lihat, Ubah, Hapus, Keluar).
* Jika memilih **Option 2 (Lihat Daftar Proyek)**, sistem akan melakukan *looping* membaca `ArrayList` proyek dan menampilkan seluruh daftar proyek *typesetting* yang terdaftar lengkap dengan rincian komik, typesetter, nomor chapter, dan statusnya.

---

### 2. Menambahkan Proyek Baru (Create)
[Tambah Data Proyek]

<img width="853" height="262" alt="image" src="https://github.com/user-attachments/assets/6f14106c-f237-4de2-8dec-556fe62825e6" />


**Penjelasan:**
* Pengguna memilih **Option 1 (Tambah Proyek)** untuk memasukkan data proyek baru.
* Sistem akan meminta input data komik (ID, Judul, Genre), data typesetter (ID, Nama, Level Pengalaman), nomor chapter, dan status pengerjaan.
* Data tersebut di-instansiasi menjadi objek dan ditambahkan ke dalam `ArrayList` proyek.

---

### 3. Mengubah Data Proyek (Update)
[Update Data Proyek]

<img width="983" height="357" alt="image" src="https://github.com/user-attachments/assets/eb7f6e19-a5a5-40d6-9c31-032b842e0882" />


**Penjelasan:**
* Pengguna memilih **Option 3 (Ubah Data Proyek)**.
* Sistem menampilkan daftar proyek beserta nomor indeksnya, lalu meminta pengguna memilih nomor proyek yang ingin diubah.
* Pengguna menginputkan data pembaruan berupa Nomor Chapter terbaru dan Status Pengerjaan terkini.

---

### 4. Menghapus Proyek (Delete) & Keluar dari Program
[Hapus Data dan Keluar]

<img width="1067" height="542" alt="image" src="https://github.com/user-attachments/assets/7acd0f9a-cb46-4ad1-98c8-24e8187f1cff" />

**Penjelasan:**
* Pengguna memilih **Option 4 (Hapus Proyek)** untuk menghapus data berdasarkan indeks daftar. Objek terkait akan dihapus dari `ArrayList`.
* Pengguna memilih **Option 5 (Keluar)** untuk mengakhiri jalannya aplikasi dengan aman.

---

## 🌟 Penerapan Nilai Tambah (Validation & Exception Handling)

[Validasi Input Nilai Tambah]

<img width="1110" height="676" alt="image" src="https://github.com/user-attachments/assets/321492c1-7019-41df-9b89-8e5fd35b4b5f" />

**Penjelasan Letak Nilai Tambah:**
1. **Validasi Input Tipe Data (*InputMismatchException*):**
   * Terletak pada proses input angka/menu dan nomor chapter. Jika pengguna menginputkan karakter non-angka (seperti huruf/simbol), sistem menggunakan blok `try-catch` untuk menangkap *exception* sehingga program tidak mengalami *crash* atau *error*, melainkan menampilkan pesan peringatan dan meminta pengguna memasukkan input kembali.
2. **Validasi Batasan Nilai (Logika Bisnis):**
   * Terletak pada input **Nomor Chapter**. Sistem secara otomatis menolak masukan angka negatif atau nol, memastikan nomor chapter bernilai positif (>= 1).
