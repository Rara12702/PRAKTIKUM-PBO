/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author Rara Deninda
 */
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        System.out.println("Simpanan "+ anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());

        anggota1.pinjam(50000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());

    }
}
