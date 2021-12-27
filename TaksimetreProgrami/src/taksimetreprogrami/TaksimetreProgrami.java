/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksimetreprogrami;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class TaksimetreProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        double taksimetre=2.20;
        int mintutar=20, acilis=10;
        System.out.println("taksimetre tutarı: "+ taksimetre);
        System.out.println("minimum tutar: "+mintutar);
        System.out.println("acilis tutar: "+acilis);
        System.out.println("mesafe giriniz: ");
        double mesafe = inp.nextDouble();
        double tutar = acilis +(mesafe * taksimetre);
        if(tutar<20){
            System.out.println("toplam ödecenek tutar:"+ mintutar);
        }
        else{
            System.out.println("toplam ödecenek tutar:"+ tutar);
        }
        
    }
    
}
