package demo.maven.banka;

import java.util.HashMap;
import java.util.Scanner;

public class BankaUygulamasi extends BankaMethods{

    boolean login = false;

    public BankaUygulamasi(){

        super();
    }
    public void testiniumBank(){

        Scanner input = new Scanner(System.in);
        String menu = "1 - Kayit Ol\n" +
                "2 - Giris Yap\n" +
                "3 - Para Yatir\n" +
                "4 - Para Cek\n" +
                "5 - Güvenli Çıkış\n" +
                "0 - Uygulamadan Çık";
        boolean sistemAktif = true;
        while (sistemAktif){
            System.out.println(menu);
            String secim = input.nextLine();
            switch (secim){
                case "1":
                    if(kayitOl()){
                        System.out.println("Kayit Başarılı");
                    }else {
                        System.out.println("Kayit Başarısız");
                    }
                    break;
                case "2":
                    if (!login){
                        if(girisYap()){
                            login = true;
                        }
                    }
                    break;
                case "3":
                    if (login) {
                        paraYatir();
                    }
                    break;
                case "4":
                    if (login) {
                        paraCek();
                    }
                    break;
                case "5":
                    guvenliCikis();
                    login = false;
                    break;
                case "0":
                    sistemAktif = false;
                    break;
                default:
                    System.out.println("Hatali girdi tekrar deneyiniz");
            }
        }
    }

    @Override
    public void paraYatir(){

        super.paraYatir();
        System.out.println("Para yatirma başarılı");
    }


}
