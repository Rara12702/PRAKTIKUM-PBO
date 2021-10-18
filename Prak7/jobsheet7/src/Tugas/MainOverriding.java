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
public class MainOverriding {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Manusia dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        man.bernafas();
        man.makan();
        
        dosen.makan();
        mhs.makan();
    }
}
