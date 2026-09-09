/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class ProyekTypeset {
    private String idProyek;
    private Komik komik;
    private Typesetter typesetter;
    private int chapter;
    private String status; // "Dalam Pengerjaan", "Revisi", "Selesai"

    // Constructor
    public ProyekTypeset(String idProyek, Komik komik, Typesetter typesetter, int chapter, String status) {
        this.idProyek = idProyek;
        this.komik = komik;
        this.typesetter = typesetter;
        this.chapter = chapter;
        this.status = status;
    }

    // Getter dan Setter
    public String getIdProyek() {
        return idProyek;
    }

    public void setIdProyek(String idProyek) {
        this.idProyek = idProyek;
    }

    public Komik getKomik() {
        return komik;
    }

    public void setKomik(Komik komik) {
        this.komik = komik;
    }

    public Typesetter getTypesetter() {
        return typesetter;
    }

    public void setTypesetter(Typesetter typesetter) {
        this.typesetter = typesetter;
    }

    public int getChapter() {
        return chapter;
    }

    // Setter dengan Nilai Tambah: Validasi Input
    public void setChapter(int chapter) {
        if (chapter > 0) {
            this.chapter = chapter;
        } else {
            System.out.println("[PERINGATAN] Nomor chapter harus lebih dari 0!");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
