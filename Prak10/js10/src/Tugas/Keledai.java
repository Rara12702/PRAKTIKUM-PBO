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
public class Keledai extends Binatang implements IHerbivora {
    private String suara, warnaBulu;
    
  public Keledai(String name, int jmlKaki, String sound, String warna) {
        super(name, jmlKaki);
        this.suara = sound;
        this.warnaBulu = warna;
    }
    
    @Override
    public void displayMakan() {
        System.out.println("Makanan\t\t: Tumbuhan");
    }
    
    public void displayBinatang() {
        System.out.println("Jenis\t\t: Herbivora");
    }
    
    public void displayData() {
        System.out.println("Nama\t\t: " + this.name);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu);
        System.out.println();
    }
}
