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
public class JooSeokKyung extends SimSooRyeon {
     private String status;

    public JooSeokKyung(String nama, String posisi, String kegiatan) {
        super(nama, posisi, kegiatan);
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void info() {
        System.out.println("Inheritence");
        super.info();
        System.out.println("Status    : "+ status);
    }
    
}
