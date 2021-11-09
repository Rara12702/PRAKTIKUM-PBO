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
public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gorila = new Gorilla("Gulali", 4, "Haum Haum", "Hitam Manis");
        Singa singaa = new Singa("Roaar Roaaar", "Coklat", "CingaCing", 4);
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        
        gorila.displayBinatang();
        gorila.displayMakan();
        gorila.displayData();
        
        singaa.displayBinatang();
        singaa.displayMakan();
        singaa.displayData();
    }
}
