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
public class Zombie implements Destroyable{
    protected int health, level;
    
    public void heal(){
    }
    
    public void destroyed(){
    }
    
    public String getZombieInfo(){
        return "Health = "+ health + "\n" +"Level = "+ level;
    }
}
