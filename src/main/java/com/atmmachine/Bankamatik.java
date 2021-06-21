package com.atmmachine;

import com.atmmachine.islemler.ParaIslemleri;
import com.atmmachine.müsteri.BireyselMüsteri;
import com.atmmachine.müsteri.KurumsalMüsteri;
import com.atmmachine.müsteri.Müsteri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Bankamatik {

    public static void main(String[] args) {

        Müsteri müsteri = new Müsteri();
        ParaIslemleri paraIslemleri = new ParaIslemleri();

        BireyselMüsteri mahmut = new BireyselMüsteri();
        mahmut.setAd("Mahmut");
        mahmut.setSoyad("Tuncer");
        mahmut.setTcKimlikNo("12345678901");
        mahmut.setHesapBakiyesi(50);
        mahmut.setEvAdresi("Orman Mahallesi Jurassic Sokak");

        KurumsalMüsteri ibo = new KurumsalMüsteri();
        ibo.setAd("İbrahim");
        ibo.setSoyad("Tatlıses");
        ibo.setTcKimlikNo("3456721234");
        ibo.setHesapBakiyesi(1000000000);
        ibo.setSirketAdi("İbo Show");

        BireyselMüsteri mustafa = new BireyselMüsteri();
        mustafa.setAd("Mustafa");
        mustafa.setSoyad("Topaloğlu");
        mustafa.setTcKimlikNo("1234543252");
        mustafa.setHesapBakiyesi(80050);
        mustafa.setEvAdresi("Uzay Mahallesi Jüpiter Sokak");

        KurumsalMüsteri yıldız = new KurumsalMüsteri();
        yıldız.setAd("Yıldız");
        yıldız.setSoyad("Tilbe");
        yıldız.setTcKimlikNo("345643256433");
        yıldız.setHesapBakiyesi(25000000);
        yıldız.setSirketAdi("YıldızLa Yaldızlı Geceler Show");

        KurumsalMüsteri müslüm = new KurumsalMüsteri();
        müslüm.setAd("Müslüm");
        müslüm.setSoyad("Gürses");
        müslüm.setTcKimlikNo("32434643534");
        müslüm.setHesapBakiyesi(75000000);
        müslüm.setSirketAdi("Müslüm Baba Show");

        Map<String , Müsteri> müsteriMap = new HashMap<>();
        müsteriMap.put("1234",mahmut);
        müsteriMap.put("2345",ibo);
        müsteriMap.put("3456",mustafa);
        müsteriMap.put("4567",yıldız);
        müsteriMap.put("5678",müslüm);

        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Lütfen müşteri numarasını giriniz(Müşteri numaraları : (1234) - (2345) - (3456) - (4567) - (5678) : " );
        String müsteriNo = input.nextLine();

        müsteri.müsteriCagir(müsteriMap,müsteriNo);

        System.out.println("-------------------------------------");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz \n" + "Para yatırmak için 1 e basınız \n" + "Para çekmek için 2 ye basınız");
        int secim = input.nextInt();
        paraIslemleri.paraIslemleriYap(secim,müsteriMap,müsteriNo);

        System.out.println("Yeni bir işlem yapmak istiyorsanız 1 e basınız. \n " + "Çıkmak için 2 ye basınız.");

    }

}
