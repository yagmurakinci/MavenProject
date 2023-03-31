package demo.maven.Main;

import demo.maven.demo.SwitchCase;

public class MainClass {

    public static void main(String[] args) {

        SwitchCase switchCase = new SwitchCase();
        /**
        System.out.println("Hello Maven");
        String not1 = "Uyarı:     Bugün hava çok SİCAK  ";
        not1 = switchCase.switchCaseExample1(not1);
        System.out.println(not1);
        String not2 = "Bilgi:     Bugün hava çok soğuk olmuş  ";
        not2 = switchCase.switchCaseExample1(not2);
        System.out.println(not2);
         */

        String not = "Bilgi:  Fırtına uyarısı\n Şiddetli yağmur   ";
        String not3 = switchCase.switchCaseExample1(not);
        System.out.println(not3);
        String not4 = switchCase.switchCaseExample2(not);
        System.out.println(not4);
    }
}
