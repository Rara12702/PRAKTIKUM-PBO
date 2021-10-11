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
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int y = 0;
   
    DaftarGaji(){
        
    }
    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
   
    public void addPegawai(Pegawai p){
        listPegawai[y] = p;
        y++;
    }
   
    public void printSemuaGaji(){
        for (int x=0;x<y;x++){
            System.out.println("-------------------------------------------------------");
            System.out.println("Nama Dosen : " + listPegawai[x].getNama());
            System.out.println("Gaji Dosen : " +  listPegawai[x].getGaji());
        }
    }
}
