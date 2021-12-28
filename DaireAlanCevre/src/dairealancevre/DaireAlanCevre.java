/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairealancevre;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class DaireAlanCevre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("yaricap gir: ");
        int r = inp.nextInt();
        double p=3.14;
        double alan = p * r * r;
        double cevre = 2 * p * r; 
        System.out.println("aci gir: ");
        double aci = inp.nextDouble();
        double dilimalan= (p*(r*r)*aci)/360;
        System.out.println("daire dilimi alani: "+ dilimalan);
        
    }
    
}
