/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.*;
/**
 *
 * @author Rara Deninda
 */
public class TestBackendPeminjaman {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota().getById(1);
        Anggota ang6 = new Anggota().getById(2);
        Buku buku1 = new Buku().getById(1);
        Buku buku2 = new Buku().getById(2);
        
        Peminjaman pjm2 = new Peminjaman(ang6, buku2, "20211119", "20211121");
    
        //test insert
        pjm2.save();
        
        //test update
        pjm2.setBuku(buku2);
        pjm2.save();
        
        //test select all
        for (Peminjaman p : new Peminjaman().getAll()){
            System.out.println("Nama: "+ p.getAnggota().getNama() + ", Buku: " + p.getBuku());
        }
        
        //test search
        for(Peminjaman p : new Peminjaman().search("1")){
            System.out.println("Nama: "+ p.getAnggota().getNama() + ", Buku: " + p.getBuku());
        }
        
    }
}
