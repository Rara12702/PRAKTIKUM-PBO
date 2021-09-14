/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class PulpenRara {
    private String merek;
    private String warnaTinta;
    private String ukuran;
    
    public void setMerek(String newVal){
        merek = newVal;
    }
    
    public void setWarnaTinta(String newVal) {
        warnaTinta = newVal;
    }
    
    public void setUkuran(String newVal){
        ukuran = newVal;
    }
    
    public void cetakStatus(){
        System.out.println("Merek \t\t: "+ merek);
        System.out.println("Warna tinta \t: "+ warnaTinta);
        System.out.println("Ukuran \t\t: "+ ukuran);
    }
}
