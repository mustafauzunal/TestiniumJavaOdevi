package com.atmmachine.müsteri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Müsteri {

    private String tcKimlikNo;
    private String ad;
    private String soyad;
    private double hesapBakiyesi;
    Scanner input = new Scanner(System.in);

    public Müsteri() {
    }

    public Müsteri(String tcKimlikNo, String ad, String soyad, double hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.ad = ad;
        this.soyad = soyad;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String  getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void müsteriCagir(Map müsteriMap, String müsteriNo){

        if(müsteriMap.containsKey(müsteriNo)){
            if(müsteriMap.get(müsteriNo) instanceof KurumsalMüsteri)
            {
                System.out.println("Müşteri Bilgileri : \n" +
                        "Ad-Soyad : " + ((KurumsalMüsteri) müsteriMap.get(müsteriNo)).getAd() + " " + ((KurumsalMüsteri) müsteriMap.get(müsteriNo)).getSoyad() + "\n" +
                        "Tc Kimlik No : " + ((KurumsalMüsteri) müsteriMap.get(müsteriNo)).getTcKimlikNo() + "\n" +
                        "Hesap Bakiyesi : " + ((KurumsalMüsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi() + "\n" +
                        "Şirket Adı : " + ((KurumsalMüsteri) müsteriMap.get(müsteriNo)).getSirketAdi());

            }else if(müsteriMap.get(müsteriNo) instanceof  BireyselMüsteri){
                System.out.println("Müşteri Bilgileri : \n" +
                        "Ad-Soyad : " + ((BireyselMüsteri) müsteriMap.get(müsteriNo)).getAd() + " " + ((BireyselMüsteri) müsteriMap.get(müsteriNo)).getSoyad() + "\n" +
                        "Tc Kimlik No : " + ((BireyselMüsteri) müsteriMap.get(müsteriNo)).getTcKimlikNo() + "\n" +
                        "Hesap Bakiyesi : " + ((BireyselMüsteri) müsteriMap.get(müsteriNo)).getHesapBakiyesi() + "\n" +
                        "Ev adresi : " + ((BireyselMüsteri) müsteriMap.get(müsteriNo)).getEvAdresi());
            }

        }else{
            System.out.println("Sistemimizde böyle bir müşteri yoktur lütfen geçerli bir müsteri numarası giriniz.");
            System.out.println("Lütfen müşteri numarasını giriniz(Müşteri numaraları : (1234) - (2345) - (3456) - (4567) - (5678) : " );

            String müsteriNumber = input.nextLine();
            müsteriCagir(müsteriMap,müsteriNumber);
        }

    }

}
