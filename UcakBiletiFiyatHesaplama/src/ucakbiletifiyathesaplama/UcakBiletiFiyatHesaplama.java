/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucakbiletifiyathesaplama;

import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class UcakBiletiFiyatHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int mesafe, yas, tip;
        System.out.println("Mesafeyi km türünden giriniz ");
        mesafe = inp.nextInt();
        System.out.println("Yaşınızı giriniz ");
        yas = inp.nextInt();
        if(mesafe<0 || yas<0){
            System.out.println("Hatalı veri girdiniz !");
        }
        System.out.println("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş )");
        tip = inp.nextInt();
        
//        if(tip!=1 || tip!=2){
//            System.out.println("Hatalı veri girdiniz !");
//        }
        double tutar = mesafe * 0.10;
        System.out.println("Normal Tutar = Mesafe * 0.10 ="+ mesafe+" * 0.10"+ "= "+ tutar);
        double indirimOran;
       
        if(yas<12){
             indirimOran=0.50;
//            double yasIndirimli12=(tutar*indirimOran12);
//            System.out.println("Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = "+ tutar+ " * 0.10 = " + yasIndirimli12);
        }
        else if(yas>12 && yas<24){
             indirimOran=0.10;
//            double yasIndirimli2=(tutar*indirimOran2);
//            System.out.println("Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = "+ tutar+ " * 0.10 = " + yasIndirimli2);
        }
        else{
             indirimOran=0.30;
//            double yasIndirimli3=(tutar*indirimOran3);
//            System.out.println("Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = "+ tutar+ " * 0.10 = " + yasIndirimli3);
        }
        
        double tipIndirimOran=0.0;
        if(tip==2){
             tipIndirimOran=0.20;
        }
        
        
        
        double yasIndirimi=tutar*indirimOran;
        double yasIndirimliTutar=tutar-yasIndirimi; 
        System.out.println("İndirimli Tutar = Normal Tutar – Yaş İndirimi = "+tutar+ " - "+ indirimOran+" = "+ yasIndirimliTutar);
        double gidisdonus= yasIndirimliTutar*tipIndirimOran;
        if(tip==1){
            System.out.println("Gidiş Dönüş Bilet İndiriminiz bulunmamaktadır. İndirim tutarınız: "+gidisdonus);
        }
        if(tip==2){
            System.out.println("Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = "+ yasIndirimliTutar+ " * 0.20 = "+ gidisdonus);
        }
       // System.out.println("Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = "+ yasIndirimliTutar+ " * 0.20 = "+ gidisdonus);
        double toplamtutar=(yasIndirimliTutar-gidisdonus)*2;
        System.out.println("Toplam Tutar = ("+yasIndirimliTutar+"-"+gidisdonus+")*2="+toplamtutar);
        
    }
    
}
