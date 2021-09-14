/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class LemariBajuRara extends LemariRara{
    private String bagian;
    private String size;
    
    public void setBagian(String newVal){
        bagian = newVal;
    }
    
    public void setSize(String newVal){
        size = newVal;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Bagian \t\t: "+ bagian);
        System.out.println("Size \t\t: "+size);
    }
}
