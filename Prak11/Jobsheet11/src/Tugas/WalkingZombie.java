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
public class WalkingZombie extends Zombie{

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        if(super.level == 1){
            super.health = (int) (super.health + (super.health * 0.1));
        } else if (super.level == 2){
            super.health = (int) (super.health + (super.health * 0.3));
        } else if (super.level == 3){
            super.health = (int) (super.health + (super.health * 0.4));
        }
    }
 
    @Override
    public void destroyed(){
        super.health = (int) (super.health - (super.health * 0.02));
    }

    @Override
    public String getZombieInfo(){
        String info = super.getZombieInfo() + "\n";
        return info;
    }
    
}
