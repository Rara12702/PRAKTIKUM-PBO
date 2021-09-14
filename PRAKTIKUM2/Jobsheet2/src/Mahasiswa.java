/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    
    public void tampilBiodata(){
        System.out.println("Nim \t: "+ nim);
        System.out.println("Nama \t: "+ nama);
        System.out.println("Alamat \t: "+ alamat);
        System.out.println("Kelas \t: "+ kelas);
    }
}
