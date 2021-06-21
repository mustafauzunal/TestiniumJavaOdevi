package com.atmmachine.müsteri;

public class BireyselMüsteri extends Müsteri{

    private String evAdresi;

    public BireyselMüsteri() {
    }

    public BireyselMüsteri(String tcKimlikNo, String ad, String soyad, double hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, ad, soyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }
}
