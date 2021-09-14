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
public class Lingkaran {
    public double phi;
    public double r;
    
    public double luasLingkuran(){
        return phi * r * r;
    }
    
    public double kelilingLingkaran(){
        return 2 * phi * r;
    }
}
