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
public class LingkaranMain {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        
        l.r = 28;
        l.phi = 3.14;
        
        System.out.println("Luas \t\t: "+ l.luasLingkuran());
        System.out.println("Keliling \t: "+ l.kelilingLingkaran());
    }
}
