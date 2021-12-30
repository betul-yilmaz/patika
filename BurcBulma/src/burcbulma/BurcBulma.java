/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burcbulma;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class BurcBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int ay, gun;
        System.out.println("sayı ile doğum ayı giriniz: ");
        ay = inp.nextInt();
        System.out.println("sayı ile doğum gunu giriniz: ");
        gun = inp.nextInt();
                           
        if(ay==1){
            if(gun<=21){
                System.out.println("Oğlak");
            }
            else{
                System.out.println("Kova");
            }
        }
        if(ay==2){
            if(gun<=19){
                System.out.println("Kova");
            }
            else{
                System.out.println("Balık");
            }
        }
        if(ay ==3){
            if(gun<=20){
                System.out.println("Balık");
            }
            else{
                System.out.println("Koç");
            }
        }
        else if(ay==4){
            if(gun<=20){
                System.out.println("Koç");
            }
            else{
                System.out.println("Boğa");
            }
        }
        else if (ay == 5) {
            if (gun < 21) {
                System.out.println("Boğa");
            } 
            else {
                System.out.println("İkizler");
            }
        }
        else if (ay == 6) {
            if (gun < 21) {
                System.out.println("İkizler");
            } 
            else {
                System.out.println("Yengeç");
            }
        }
        else if (ay == 7) {
            if (gun <= 22) {
                System.out.println("Yengeç");
            } 
            else {
                System.out.println("Aslan");
            }
        }
        else if (ay == 8) {
            if (gun < 22) {
                System.out.println("Aslan");
            } 
            else {
                System.out.println("Başak");
            }
        }
        else if (ay == 9) {
            if (gun < 22) {
                System.out.println("Başak");
            } 
            else {
                System.out.println("Terazi");
            }
        }
        else if (ay == 10) {
            if (gun < 22) {
                System.out.println("Terazi");
            } 
            else {
                System.out.println("Akrep");
            }
        }
        else if (ay == 11) {
            if (gun < 21) {
                System.out.println("Akrep");
            } 
            else {
                System.out.println("Yay");
            }
        }
        else if (ay == 12) {
            if (gun < 21) {
                System.out.println("Yay");
            } 
            else {
                System.out.println("Oğlak");
            }
        }
        
        
    }
    
}
