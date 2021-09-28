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
public class Main {
    public static void main(String[] args){
     
        SimSooRyeon pemilik = new SimSooRyeon("Sim Soo Ryeon", "Pemilik Hera Palace dan seorang ibu", "Mengurus pekerjaan rumah");
        JooDanTae penghuni = new JooDanTae ("Joo Dan Tae", "Pembisnis Real Estate", "Mengurus bisnis");
        JooSeokKyung anak = new JooSeokKyung("Joo Seok Kyung", "Anak Sim Soo Ryeon & Joo Dan Tae", "Sekolah");
        HeraPalace hera = new HeraPalace("Hera Palace", 100, pemilik, penghuni);
        
        anak.setNama("Joo Seok Kyung");
        anak.setPosisi("Anak Sim Soo Ryeon & Joo Dan Tae");
        anak.setKegiatan("Sekolah, belajar, bermain");
        anak.setStatus("Pelajar");
        
        hera.info();
        anak.info();
    }
}
