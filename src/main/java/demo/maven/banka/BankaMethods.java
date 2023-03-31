package demo.maven.banka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public abstract class BankaMethods implements BankaInterface{

    Scanner input = new Scanner(System.in);
    HashMap<Integer, Musteri> bankaMap = new HashMap<>();
    Musteri currentMusteri;
    
    public BankaMethods(){

    }
    
    @Override
    public boolean kayitOl() {
        
        Musteri musteri = new Musteri();
        System.out.print("Lütfen Adınızı giriniz: ");
        musteri.setMusteriAdi(input.nextLine());
        System.out.print("Lütfen Soyadınızı giriniz: ");
        musteri.setMusteriSoyadi(input.nextLine());
        System.out.print("Lütfen Cinsiyeti E yada K olarak giriniz: ");
        String cinsiyet = input.nextLine();
        switch (cinsiyet.toUpperCase()){
            case "E":
                musteri.setCinsiyet(Cinsiyet.ERKEK);
                break;
            case "K":
                musteri.setCinsiyet(Cinsiyet.KADIN);
                break;
            default:
                System.exit(-1);
        }
        System.out.print("Lütfen Sifre giriniz: ");
        int i = 0;
        int sifre = 0;
        while (true) {
            if (i==3){
                return false;
            }
            try {
            sifre = Integer.valueOf(input.nextLine());
            if (String.valueOf(sifre).length() == 6) {
                break;
            }
            }catch (Throwable e){
                //e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("sifre hatali");
            }
            i++;
        }
        musteri.setSifre(sifre);
        musteri.setHesapHareketleri(new ArrayList<>());
        musteri.setBakiye(0.0);
        int musteriNo = bankaMap.size() + 1;
        System.out.println(musteriNo);
        musteri.setMusteriNo(musteriNo);
        bankaMap.put(musteriNo, musteri);
        return true;
    }

    @Override
    public boolean girisYap() {

        System.out.print("Musteri Noyu giriniz: ");
        int musteriNo = input.nextInt();
        if (!bankaMap.containsKey(musteriNo)){
            System.out.println("Musteri bulunamadi");
            return false;
        }
        currentMusteri = bankaMap.get(musteriNo);
        System.out.print("Sifre giriniz: ");
        int sifre = input.nextInt();
        if (currentMusteri.getSifre() != sifre){
            return false;
        }
        String text = currentMusteri.getCinsiyet()
                .name().equals("ERKEK") ? "Bey" : "Hanım";
        System.out.println(currentMusteri.getMusteriAdi()
                + " " + text + " Hoşgeldiniz");
        return true;
    }

    @Override
    public void guvenliCikis() {

        currentMusteri = null;
    }

    @Override
    public void paraYatir() {

        System.out.print("Yatırılacak miktarı giriniz: ");
        double yatirilanMiktar = input.nextDouble();
        double guncelBakiye = currentMusteri.getBakiye() + yatirilanMiktar;
        System.out.println(guncelBakiye);
        currentMusteri.setBakiye(guncelBakiye);
        currentMusteri.getHesapHareketleri().add(yatirilanMiktar + " yatirildi");
    }

    @Override
    public void paraCek() {

        System.out.print("Cekilen miktarı giriniz: ");
        double cekilenMiktar = input.nextDouble();
        double guncelBakiye = currentMusteri.getBakiye() - cekilenMiktar;
        System.out.println(guncelBakiye);
        currentMusteri.setBakiye(guncelBakiye);
        currentMusteri.getHesapHareketleri().add(cekilenMiktar + " cekildi");
    }
}
