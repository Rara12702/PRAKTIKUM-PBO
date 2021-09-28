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
public class HeraPalace {
    private String nama;
    private int lantai;
    private SimSooRyeon pemilik;
    private JooDanTae penghuni;
    
    HeraPalace(String nama, int lantai){
        this.nama = nama;
        this.lantai = lantai;
    }

    public HeraPalace(String nama, int lantai, SimSooRyeon pemilik, JooDanTae penghuni) {
        this.nama = nama;
        this.lantai = lantai;
        this.pemilik = pemilik;
        this.penghuni = penghuni;
    }  

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLantai() {
        return lantai;
    }

    public void setLantai(int lantai) {
        this.lantai = lantai;
    }

    public SimSooRyeon getPemilik() {
        return pemilik;
    }

    public void setPemilik(SimSooRyeon pemilik) {
        this.pemilik = pemilik;
    }

    public JooDanTae getPenghuni() {
        return penghuni;
    }

    public void setPenghuni(JooDanTae penghuni) {
        this.penghuni = penghuni;
    }
    
    public void info(){
        System.out.println("Lokasi : "+this.nama);
        System.out.println("Lantai : "+ this.lantai);
        System.out.println("\nPemilik  ");
        this.pemilik.info();
        System.out.println("\nPenghuni  ");
        this.penghuni.info();
        //return info;
    }
    
}
