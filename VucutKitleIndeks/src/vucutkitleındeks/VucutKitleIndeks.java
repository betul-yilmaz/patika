/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vucutkitleındeks;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class VucutKitleIndeks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        int kilo = inp.nextInt();
        double index= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+index);
    }
    
}
