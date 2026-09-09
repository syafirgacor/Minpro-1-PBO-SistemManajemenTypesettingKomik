/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
import model.Komik;
import model.Typesetter;
import model.ProyekTypeset;

import java.util.ArrayList;
import java.util.Scanner;

public class Minpro1PBOSistemManajemenTypesettingKomik {
    private static ArrayList<ProyekTypeset> daftarProyek = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Data Awal (Dummy Data)
        Komik komik1 = new Komik("K01", "Solo Leveling", "Action");
        Typesetter ts1 = new Typesetter("TS01", "Ahzami", "Advanced");
        daftarProyek.add(new ProyekTypeset("PRJ01", komik1, ts1, 100, "Dalam Pengerjaan"));

        int pilihan = 0;

        // Perulangan Menu (Do-While)
        do {
            System.out.println("\n=== SISTEM MANAJEMEN TYPESETTING KOMIK ===");
            System.out.println("1. Tambah Proyek Typeset (Create)");
            System.out.println("2. Tampilkan Semua Proyek (Read)");
            System.out.println("3. Update Status/Chapter Proyek (Update)");
            System.out.println("4. Hapus Proyek (Delete)");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu (1-5): ");

            // Validasi Input Pilihan Menu
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                System.out.println("[ERROR] Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            // Percabangan Switch-Case
            switch (pilihan) {
                case 1 -> tambahProyek();
                case 2 -> tampilkanProyek();
                case 3 -> updateProyek();
                case 4 -> hapusProyek();
                case 5 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("[ERROR] Pilihan menu tidak valid!");
            }
        } while (pilihan != 5);
    }

    // Create
    private static void tambahProyek() {
        System.out.println("\n--- Tambah Proyek Typeset Baru ---");
        System.out.print("ID Proyek: ");
        String idProyek = scanner.nextLine();

        System.out.print("ID Komik: ");
        String idKomik = scanner.nextLine();
        System.out.print("Judul Komik: ");
        String judulKomik = scanner.nextLine();
        System.out.print("Genre Komik: ");
        String genreKomik = scanner.nextLine();

        System.out.print("ID Typesetter: ");
        String idTs = scanner.nextLine();
        System.out.print("Nama Typesetter: ");
        String namaTs = scanner.nextLine();
        System.out.print("Level Pengalaman: ");
        String expTs = scanner.nextLine();

        int chapter = 0;
        // Validasi Input Angka
        while (true) {
            System.out.print("Nomor Chapter: ");
            if (scanner.hasNextInt()) {
                chapter = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (chapter > 0) break;
                System.out.println("[ERROR] Chapter harus berupa angka positif!");
            } else {
                System.out.println("[ERROR] Input chapter harus berupa angka!");
                scanner.nextLine();
            }
        }

        System.out.print("Status Pengerjaan (Dalam Pengerjaan/Revisi/Selesai): ");
        String status = scanner.nextLine();

        Komik komik = new Komik(idKomik, judulKomik, genreKomik);
        Typesetter ts = new Typesetter(idTs, namaTs, expTs);
        ProyekTypeset proyekBaru = new ProyekTypeset(idProyek, komik, ts, chapter, status);

        daftarProyek.add(proyekBaru);
        System.out.println("[BERHASIL] Proyek typeset berhasil ditambahkan!");
    }

    // Read
    private static void tampilkanProyek() {
        System.out.println("\n--- DAFTAR PROYEK TYPESETTING ---");
        if (daftarProyek.isEmpty()) {
            System.out.println("Belum ada data proyek.");
            return;
        }

        // Perulangan untuk menampilkan data (For Loop)
        for (int i = 0; i < daftarProyek.size(); i++) {
            ProyekTypeset p = daftarProyek.get(i);
            System.out.printf("[%d] ID Proyek: %s | Komik: %s | Ch: %d | Typesetter: %s | Status: %s\n",
                    (i + 1), p.getIdProyek(), p.getKomik().getJudul(), p.getChapter(),
                    p.getTypesetter().getNama(), p.getStatus());
        }
    }

    // Update
    private static void updateProyek() {
        tampilkanProyek();
        if (daftarProyek.isEmpty()) return;

        System.out.print("\nMasukkan nomor urut proyek yang ingin di-update: ");
        if (!scanner.hasNextInt()) {
            System.out.println("[ERROR] Input harus berupa angka!");
            scanner.nextLine();
            return;
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        // Validasi Index
        if (index >= 0 && index < daftarProyek.size()) {
            ProyekTypeset p = daftarProyek.get(index);

            System.out.print("Masukkan Chapter Baru: ");
            if (scanner.hasNextInt()) {
                int chBaru = scanner.nextInt();
                scanner.nextLine();
                p.setChapter(chBaru);
            } else {
                System.out.println("[ERROR] Chapter harus angka. Gagal memperbarui chapter.");
                scanner.nextLine();
            }

            System.out.print("Masukkan Status Baru: ");
            String statusBaru = scanner.nextLine();
            p.setStatus(statusBaru);

            System.out.println("[BERHASIL] Data proyek berhasil diperbarui!");
        } else {
            System.out.println("[ERROR] Nomor proyek tidak ditemukan!");
        }
    }

    // Delete
    private static void hapusProyek() {
        tampilkanProyek();
        if (daftarProyek.isEmpty()) return;

        System.out.print("\nMasukkan nomor urut proyek yang ingin dihapus: ");
        if (!scanner.hasNextInt()) {
            System.out.println("[ERROR] Input harus berupa angka!");
            scanner.nextLine();
            return;
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < daftarProyek.size()) {
            daftarProyek.remove(index);
            System.out.println("[BERHASIL] Proyek telah dihapus dari sistem!");
        } else {
            System.out.println("[ERROR] Nomor proyek tidak ditemukan!");
        }
    }
}
