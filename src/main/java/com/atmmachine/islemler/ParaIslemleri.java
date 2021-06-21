package com.atmmachine.islemler;

import java.util.Map;
import java.util.Scanner;

public class ParaIslemleri {

    ParaYatırma paraYatırma = new ParaYatırma();
    ParaCekme paraCekme = new ParaCekme();
    Scanner input = new Scanner(System.in);

    public void paraIslemleriYap(int secim,Map müsteriMap,String müsteriNo){
        switch (secim){
            case 1:
                paraYatırma.paraYatırma(müsteriMap,müsteriNo);
                break;
            case 2:
                paraCekme.paraCekme(müsteriMap,müsteriNo);
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim giriniz");
                int newSecim = input.nextInt();
                paraIslemleriYap(newSecim,müsteriMap,müsteriNo);
        }
    }

}
