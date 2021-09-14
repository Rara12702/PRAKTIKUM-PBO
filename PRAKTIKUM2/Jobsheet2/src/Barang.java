/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    public int harga;
    
    public void tampilBarang(){
        System.out.println("Nama Barang \t: "+ namaBrg);
        System.out.println("Jenis Barang \t: "+ jenisBrg);
        System.out.println("Stok \t\t: "+ stok);
    }
    
    // method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
    
    public void tampilStok(){
        System.out.println("Stok : "+ stok);
    }
}
