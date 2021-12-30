/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinzodyagihesaplama;

import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class CinZodyagiHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int dogumYili;
        System.out.println("Doğum yılınızı giriniz: ");
        dogumYili = inp.nextInt();
        
                if(dogumYili%12==0){
                    System.out.println("Cin Zodyağı Burcunuz: maymun");
                }
                
                else if(dogumYili%12==1){
                    System.out.println("Cin Zodyağı Burcunuz: horoz");
                }
                else if(dogumYili%12==2){
                    System.out.println("Cin Zodyağı Burcunuz: köpek");
                }
                else if(dogumYili%12==3){
                    System.out.println("Cin Zodyağı Burcunuz: domuz");
                }
                else if(dogumYili%12==4){
                    System.out.println("Cin Zodyağı Burcunuz: fare");
                }
                else if(dogumYili%12==5){
                    System.out.println("Cin Zodyağı Burcunuz: öküz");
                }
                else if(dogumYili%12==6){
                    System.out.println("Cin Zodyağı Burcunuz: kaplan");
                }
                else if(dogumYili%12==7){
                    System.out.println("Cin Zodyağı Burcunuz: tavşan");
                }
                else if(dogumYili%12==8){
                    System.out.println("Cin Zodyağı Burcunuz: ejderha");
                }
                else if(dogumYili%12==9){
                    System.out.println("Cin Zodyağı Burcunuz: yılan");
                }
                else if(dogumYili%12==10){
                    System.out.println("Cin Zodyağı Burcunuz: at");
                }
                else if(dogumYili%12==11){
                    System.out.println("Cin Zodyağı Burcunuz: koyun");
                }
        
        
    }
    
}
