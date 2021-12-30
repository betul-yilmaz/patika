/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artikyilhesaplama;

import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class ArtikYilHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int yil;
        System.out.println("Yıl giriniz: ");
        yil = inp.nextInt();
        
        
        if(yil%100==0){
            if(yil%400==0){
                System.out.println(yil+" bir artık yıldır!");
            }
            else{
                System.out.println(yil+" bir artık yıl değildir!");
            }
        }
        else{
            if(yil%4==0){
            System.out.println(yil+" bir artık yıldır!");
        } 
        else{
            System.out.println(yil+" bir artık yıl değildir!");
        }
        }
        
        
        
        
    }
    
}
