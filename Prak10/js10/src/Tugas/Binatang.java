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
public abstract class Binatang {
    protected String name;
    protected int jmlKaki;
    
    public Binatang(String name, int jmlKaki) {
        this.name = name;
        this.jmlKaki = jmlKaki;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }
    
    public int getKaki() {
        return jmlKaki;
    }
    
    public abstract void displayBinatang();
}
