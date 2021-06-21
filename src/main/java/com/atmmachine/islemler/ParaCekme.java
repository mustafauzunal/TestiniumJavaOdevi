package com.atmmachine.islemler;

import com.atmmachine.müsteri.Müsteri;

import java.util.Map;
import java.util.Scanner;

public class ParaCekme {

    Scanner input = new Scanner(System.in);

    public void paraCekme(Map müsteriMap, String müsteriNo){

        System.out.println("Şimdiki hesap bakiyeniz : " + ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi());
        System.out.println("Lütfen ne kadar para çekmek istediğinizi giriniz : ");
        double cekilecekTutar = input.nextDouble();
        double yeniTutar;
        if(müsteriMap.get(müsteriNo) instanceof Müsteri){

            yeniTutar = ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi() - cekilecekTutar;
            if(yeniTutar<0){
                System.out.println(((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi() + " bu tutardan fazla para çekemezsiniz");
                System.out.println("Lütfen ne kadar para çekmek istediğinizi giriniz : ");
                double yeniCekilecekTutar = input.nextDouble();
                yeniTutar = ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi() - yeniCekilecekTutar;
                ((Müsteri) müsteriMap.get(müsteriNo)).setHesapBakiyesi(yeniTutar);
                System.out.println("Girilen tutar hesabınızdan çekildikten sonra yeni hesap bakiyeniz : " + ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi());
            }else{
                ((Müsteri) müsteriMap.get(müsteriNo)).setHesapBakiyesi(yeniTutar);
                System.out.println("Girilen tutar hesabınızdan çekildikten sonra yeni hesap bakiyeniz : " + ((Müsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi());
            }

        }


    }

}
