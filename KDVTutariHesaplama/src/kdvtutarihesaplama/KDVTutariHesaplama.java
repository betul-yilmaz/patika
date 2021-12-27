

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdvtutarihesaplama;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class KDVTutariHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("para giriniz: ");
        double para = inp.nextDouble();
        
        
        if(para>0 && para<1000){
            double kdv1 = 0.18;
            double kdvtoplam1 = para * kdv1;
        double kdvlipara1 = para + kdvtoplam1;
        System.out.println("kdvsiz fiyat:"+ para);
        System.out.println("kdvli fiyat:"+ kdvlipara1);
        System.out.println("kdv tutarı:"+ kdvtoplam1);
        }
        if(para>1000){
            double kdv2= 0.08;
            double kdvtoplam2 = para * kdv2;
        double kdvlipara2 = para + kdvtoplam2;
        System.out.println("kdvsiz fiyat:"+ para);
        System.out.println("kdvli fiyat:"+ kdvlipara2);
        System.out.println("kdv tutarı:"+ kdvtoplam2);
        }
        
        
    }
    
}
