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
public class BarangMain {
    public static void main(String[] args){
        Barang b = new Barang();
        
        b.kode = "2041720110";
        b.namaBarang = "Handphone";
        b.hargaDasar = 3500000;
        b.diskon = 25;
        b.tampilData();
    }
}
