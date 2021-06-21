package com.atmmachine.müsteri;

public class KurumsalMüsteri extends Müsteri {

    private String sirketAdi;

    public KurumsalMüsteri() {
    }

    public KurumsalMüsteri(String tcKimlikNo, String ad, String soyad, double hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, ad, soyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }
}
