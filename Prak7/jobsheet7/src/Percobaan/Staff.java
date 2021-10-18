/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author Rara Deninda
 */
public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;
    
    public void setLembur(int lembur){
        this.lembur = lembur;
    }
    public int getLembur(){
        return lembur;
    }
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    public double getGajiLembur() {
        return gajiLembur;
    }
    //overloading
    public double getGaji(int lembur, double gajiLembur){
        return super.getGaji() + lembur * gajiLembur;
    }
    //overriding
    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }
    
    public void lihatInfo(){
        System.out.println("NIP\t\t: " + super.getNip());
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Golongan\t: " + super.getGolongan());
        System.out.println("Jumlah Lembur\t: " + this.getLembur());
        System.out.printf("Gaji Lembur\t: %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji\t\t: %.0f\n", this.getGaji());
    }
}
