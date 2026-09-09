/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Komik {
    private String idKomik;
    private String judul;
    private String genre;

    // Constructor
    public Komik(String idKomik, String judul, String genre) {
        this.idKomik = idKomik;
        this.judul = judul;
        this.genre = genre;
    }

    // Getter dan Setter (Encapsulation & Access Modifier private)
    public String getIdKomik() {
        return idKomik;
    }

    public void setIdKomik(String idKomik) {
        this.idKomik = idKomik;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
    
