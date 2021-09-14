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
public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int bayar;
    public int lamaSewa;
    
    public void tampilPeminjaman(){    
        System.out.println("Id \t\t: "+id);
        System.out.println("Nama Member \t: "+namaMember);
        System.out.println("Nama Game \t: "+namaGame);
        System.out.println("Harga \t\t: "+harga);
        System.out.println("Lama Sewa \t: "+lamaSewa +"/jam");
    }
    
    public int tampilHargaBayar(){
        bayar = lamaSewa * harga;
        
        System.out.println("Harga yang harus dibayar : "+ bayar);
        return bayar;
    }
}
