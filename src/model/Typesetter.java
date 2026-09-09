/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Typesetter {
    private String idTypesetter;
    private String nama;
    private String pengalaman;

    // Constructor
    public Typesetter(String idTypesetter, String nama, String pengalaman) {
        this.idTypesetter = idTypesetter;
        this.nama = nama;
        this.pengalaman = pengalaman;
    }

    // Getter dan Setter
    public String getIdTypesetter() {
        return idTypesetter;
    }

    public void setIdTypesetter(String idTypesetter) {
        this.idTypesetter = idTypesetter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(String pengalaman) {
        this.pengalaman = pengalaman;
    }
}
