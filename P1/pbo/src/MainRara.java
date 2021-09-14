/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rara Deninda
 */
public class MainRara {
    public static void main(String[] args){
        LemariBajuRara lb1 = new LemariBajuRara();
        LemariBrankasRara la1 = new LemariBrankasRara();
        PulpenRara pl1 = new PulpenRara();
        TVRara tv1 = new TVRara();
        
        System.out.println("------------------------------------------");
        System.out.println("-                 LEMARI                 -");
        System.out.println("------------------------------------------");
        System.out.println();
        lb1.setMerek("Ikea");
        lb1.setWarna("Coklat");
        lb1.setSize("Besar");
        lb1.setBagian("Gantungan");
        lb1.cetakStatus();
        System.out.println("------------------------------------------");
        
        la1.setMerek("Infinity Safe");
        la1.setWarna("Abu-abu");
        la1.setJenis("Digital");
        la1.setKapasitas("Besar");
        la1.cetakStatus();
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.println("-                 PULPEN                 -");
        System.out.println("------------------------------------------");
        System.out.println();
        pl1.setMerek("Pilot");
        pl1.setWarnaTinta("Biru");
        pl1.setUkuran("0.5 mm");
        pl1.cetakStatus();
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.println("-                TELEVISI                -");
        System.out.println("------------------------------------------");
        System.out.println();
        tv1.setMerk("SAMSUNG");
        tv1.setPindahCnl("TransTV");
        tv1.cetakStatus();
        System.out.println("------------------------------------------");
    }
}
