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
public class PeminjamanMain {
    public static void main(String[] args){
        Peminjaman pj = new Peminjaman();
        
        pj.id = 2041720110;
        pj.namaMember = "Rara Deninda Hurianto";
        pj.namaGame = "Valorant";
        pj.harga = 20000;
        pj.lamaSewa = 2;
        pj.tampilPeminjaman();
        pj.tampilHargaBayar();
    }
}
