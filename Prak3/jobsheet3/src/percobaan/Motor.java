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
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    
    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if (kecepatan == 100){
            System.out.println("Kecepatan mencapai batas maksimal, kurangi kecepatan anda!");
        } else {
            if (kontakOn == true) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off:\n");
            }
        }
    }
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        }else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin off:\n");
        }
    }
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak on");
        }else {
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
