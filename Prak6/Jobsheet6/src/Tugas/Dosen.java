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
public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS = 150000;
   
    public Dosen(){
       
    }
 
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
   
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    
    public int getGaji(){
        int total_gaji = jumlahSKS * TARIF_SKS;
        return total_gaji + super.getGaji();
    }
}
