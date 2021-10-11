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
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    
    Pegawai(){
        
    }
    Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNip(String nip){
        this.nip=nip;
    }
    public String getNip(){
        return nip;
    }
    public int getGaji(){
        return 2000000;
    }
}
