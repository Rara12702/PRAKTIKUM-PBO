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
public class Main {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.setNama("Rara Deninda Hurianto");
        d.setSKS(12);
        
        Pegawai p = new Pegawai();
        p.setNama("Rasya Naomi");
        DaftarGaji dftrGj = new DaftarGaji(2);
        
        dftrGj.addPegawai(d);
        dftrGj.addPegawai(p);
        dftrGj.printSemuaGaji();
    }
}
