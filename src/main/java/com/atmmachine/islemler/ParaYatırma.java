package com.atmmachine.islemler;

import com.atmmachine.müsteri.Müsteri;

import java.util.Map;
import java.util.Scanner;

public class ParaYatırma {

    Scanner input = new Scanner(System.in);

    public void paraYatırma(Map müsteriMap, String müsteriNo){
        System.out.println("Şimdiki hesap bakiyeniz : " + ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi());
        System.out.println("Lütfen ne kadar para yatırmak istediğinizi giriniz : ");
        double yatırılacakTutar = input.nextDouble();
        double yeniTutar;
        if(müsteriMap.get(müsteriNo) instanceof Müsteri){

            yeniTutar = ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi() + yatırılacakTutar;
            ((Müsteri) müsteriMap.get(müsteriNo)).setHesapBakiyesi(yeniTutar);
            System.out.println("Girilen tutar hesabınıza yatırıldıktan sonra yeni hesap bakiyeniz : " + ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi());
        }


    }
}
