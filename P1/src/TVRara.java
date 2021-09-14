/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class TVRara {
    private String merk;
    private String channel;
    
    public void setMerk(String newVal){
        merk = newVal;
    }
    
    public void setPindahCnl(String newVal){
        channel = newVal;
    }
    
    public void cetakStatus(){
        System.out.println("Merek \t\t: "+ merk);
        System.out.println("Channel \t: "+ channel);
    }
}
