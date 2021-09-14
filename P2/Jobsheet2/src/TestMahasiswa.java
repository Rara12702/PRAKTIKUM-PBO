/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class TestMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs1.nim = 102;
        mhs1.nama = "Rara";
        mhs1.alamat = "Jl. Bunga No B4-35";
        mhs1.kelas = "1C";
        mhs1.tampilBiodata();
        
        mhs1.nim = 103;
        mhs1.nama = "Rasya";
        mhs1.alamat = "Jl. Durian No 12";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
    }
}
