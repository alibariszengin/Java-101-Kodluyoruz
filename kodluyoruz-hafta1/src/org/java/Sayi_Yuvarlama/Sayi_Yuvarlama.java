package org.java.Sayi_Yuvarlama;

import java.util.Objects;
import java.util.Scanner;

public class Sayi_Yuvarlama {
    public static void main(String[] args) {

        System.out.println("Yuvarlamak istediginiz ondalikli sayiyi giriniz: ");
        Scanner scanner = new Scanner(System.in);
            double sayi=scanner.nextDouble();

        System.out.println("Girilen sayiyi asagi yuvarlamak için 0 ," +
                "Yukari yuvarlamak icin herhangi bir sayi giriniz : ");

        int direction = scanner.nextInt();
        if (direction == 0) {
            System.out.printf("Rolled number :  %.2f",Math.floor(sayi));

        }
        else{
            System.out.printf("Rolled number :  %.2f",Math.ceil(sayi));
        }


    }
}
