/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author Rara Deninda
 */
public class EncapTest {
    public static void main(String[] args) {
        Scanner rara = new Scanner(System.in);
        EncapDemo encap = new EncapDemo();
        String name;
        int age;
        
        System.out.print("Name: \t");
        name= rara.nextLine();
        System.out.print("Age: \t");
        age = rara.nextInt();
        System.out.println("");
        
        encap.setName(name);
        encap.setAge(age);
        
        System.out.println("Name\t: " + encap.getName());
        System.out.println("Age\t: " + encap.getAge());
    }
}
