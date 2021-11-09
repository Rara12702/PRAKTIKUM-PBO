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
public class Singa extends Binatang implements IKarnivora {
    private String suara, warnaBulu;

    public Singa(String suara, String warnaBulu, String name, int jmlKaki) {
        super(name, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan() {
        System.out.println("Makanan\t\t: Daging");
    }
    
    public void displayBinatang() {
        System.out.println("Jenis\t\t: Karnivora");
    }
    
    public void displayData() {
        System.out.println("Nama\t\t: " + this.name);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu);
        System.out.println();
    }
}
