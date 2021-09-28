/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rara Deninda
 */
public class SimSooRyeon {
    private String nama;
    private String posisi;
    private String kegiatan;

    public SimSooRyeon(String nama, String posisi, String kegiatan) {
        this.nama = nama;
        this.posisi = posisi;
        this.kegiatan = kegiatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }
    
    public void info() {
        System.out.println("Nama      : "+this.nama);
        System.out.println("Pekerjaan : "+ this.posisi);
        System.out.println("Kegiatan  : "+ this.kegiatan);
       // return info;
    }
    
}
