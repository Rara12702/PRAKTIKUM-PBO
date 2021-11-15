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
public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie){
            System.out.println("Walking Zombie Data = ");
            WalkingZombie wz = (WalkingZombie) d;
            System.out.println(wz.getZombieInfo());
        } else if (d instanceof JumpingZombie){
            System.out.println("Jumping Zombie Data = ");
            JumpingZombie jz = (JumpingZombie) d;
            System.out.println(jz.getZombieInfo());
        } else if(d instanceof Barrier){
            Barrier br = (Barrier) d;
            System.out.println(br.getBarrierInfo());
        }
    }
}
