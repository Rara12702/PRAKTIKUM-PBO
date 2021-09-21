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
public class Anggota {
    private String ktpNo,nama;
    private int limit, jumlah;
    
    Anggota(String name, String ktpNo, int limit) {
        this.nama = name;
        this.ktpNo = ktpNo;
        this.limit = limit;
    }
    public String getName() {
        return nama;
    }
    public int getLimitPinjaman() {
        return limit;
    }
    public void pinjam(int pinjam){
        if(pinjam < limit) {
            jumlah = pinjam;
        }else {
            System.out.print("Maaf, pinjaman melebihi limit!\n");
        }
    }
    public void angsur(int angsur){
        int angsuran;
        angsuran = (int) (jumlah * 0.1);
        if (angsur >= angsuran){
            jumlah = jumlah - angsur;
        } else {
            System.out.println("Maaf, Angsuran Harus 10% dari Jumlah Pinjaman");
        }
    }
    public int getJumlahPinjaman() {
        return jumlah;
    }
}
