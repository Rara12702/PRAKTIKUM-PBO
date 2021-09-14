/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class LemariRara {
    private String merek;
    private String warna;
    
    public void setMerek(String newVal){
        merek = newVal;
    }
    
    public void setWarna(String newVal){
        warna = newVal;
    }
    
    public void cetakStatus(){
        System.out.println("Merek \t\t: "+ merek);
        System.out.println("Warna \t\t: "+ warna);
    }
}
