/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author Rara Deninda
 */
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner rara = new Scanner(System.in);
        Anggota donny = new Anggota("Donny","111333444", 5000000);
        
        System.out.println("Nama Anggota\t: " + donny.getName());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPinjaman());
        
        int menu, pinjaman, angsuran;
        
        do{
            System.out.println("===================");
            System.out.println("1. Peminjaman");
            System.out.println("2. Angsuran");
            System.out.println("3. Selesai\n");
            System.out.print("Menu  : ");
            menu = rara.nextInt();
            System.out.println("===================");
            if(menu == 1){
                System.out.print("Nominal Pinjaman  : ");
                pinjaman = rara.nextInt();
                donny.pinjam(pinjaman);
                System.out.println("Meminjam Uang "+pinjaman);
                System.out.println("Jumlah pinjaman   : " + donny.getJumlahPinjaman());
            } else if(menu == 2){
                System.out.print("Nominal Angsuran  : ");
                angsuran = rara.nextInt();
                donny.angsur(angsuran);
                System.out.println("Membayar Angsuran "+angsuran);
                System.out.println("Jumlah pinjaman   : " + donny.getJumlahPinjaman());
            }
        } while(donny.getJumlahPinjaman() != 0 && menu != 3);
    }
}
