package org.java.Ortalama;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        int i=0;
        int ortak_kat=53*3*5*7;
        float toplam_53=0,toplam_3=0,toplam_5=0,toplam_7=0,toplam_ekok=0;
        int sayi_3=0,sayi_53=0,sayi_5=0,sayi_7=0,sayi_ekok=0;

        for(i=0;i<2000;i++){

            if(i%3==0){
                toplam_3=toplam_3+i;
                sayi_3++;
            }
            if(i%5==0){
                toplam_5=toplam_5+i;
                sayi_5++;
            }
            if(i%7==0){
                toplam_7=toplam_7+i;
                sayi_7++;
            }
            if(i%53==0){
                toplam_53=toplam_53+i;
                sayi_53++;
            }
            if(i%(53*3*5*7)==0){
                toplam_ekok=toplam_ekok+i;
                sayi_ekok++;
            }

        }
        System.out.printf(("3 icin Ortalama : %.2f \n" +
                        "5 icin Ortalama : %.2f \n" +
                        "7 icin Ortalama : %.2f\n" +
                        "53 icin Ortalama : %.2f \n" +
                        "En kucuk ortak katlari icin Ortalama : %.2f"), toplam_3 / sayi_3, toplam_5 / sayi_5, toplam_7 / sayi_7,
                toplam_53 / sayi_53, toplam_ekok / sayi_ekok);
    }
}
