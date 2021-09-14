/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class LemariBrankasRara extends LemariRara {
    private String kapasitas;
    private String jenis;
    
    public void setKapasitas(String newVal){
        kapasitas = newVal;
    }
    
    public void setJenis(String newVal){
        jenis = newVal;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Kapasitas \t: "+ kapasitas);
        System.out.println("Jenis pengaman \t: "+ jenis);
    }
}
