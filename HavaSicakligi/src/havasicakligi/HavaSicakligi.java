/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package havasicakligi;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class HavaSicakligi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int heat;
        System.out.println("Sıcaklık giriniz: ");
        heat = inp.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        if(heat>=5 && heat<15){
            System.out.println("Sinemaya gidebilirsiniz ");
        }
        if(heat >=15 && heat<25){
            System.out.println("Piknik yapabilirsiniz");
        }
        if(heat>=25){
            System.out.println("Yüzebilirsiniz");
        }
        
        
        
        
        
    }
    
}
