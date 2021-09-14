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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        diskon = diskon / 100;
        return (int) (hargaDasar - (diskon * hargaDasar));
    }
    
    public void tampilData(){
        System.out.println("Kode \t\t: "+kode);
        System.out.println("Nama Barang \t: "+ namaBarang);
        System.out.println("Harga Dasar \t: "+ hargaDasar);
        System.out.println("Diskon \t\t: "+ diskon +"%");
        System.out.println("Harga Jual \t: "+hitungHargaJual());
    }
}
