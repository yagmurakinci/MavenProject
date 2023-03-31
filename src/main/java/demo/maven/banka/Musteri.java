package demo.maven.banka;

import java.util.List;

public class Musteri {

    private int MusteriNo;
    private String MusteriAdi;
    private String MusteriSoyadi;
    private double bakiye;
    private int sifre;
    private List<String> hesapHareketleri;
    private Cinsiyet cinsiyet;

    public Musteri(){

    }

    public int getMusteriNo() {
        return MusteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        MusteriNo = musteriNo;
    }

    public String getMusteriAdi() {
        return MusteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        MusteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return MusteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        MusteriSoyadi = musteriSoyadi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public List<String> getHesapHareketleri() {
        return hesapHareketleri;
    }

    public void setHesapHareketleri(List<String> hesapHareketleri) {
        this.hesapHareketleri = hesapHareketleri;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
