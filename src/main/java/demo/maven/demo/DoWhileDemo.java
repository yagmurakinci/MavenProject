package demo.maven.demo;

import java.util.Random;

public class DoWhileDemo {

    public static void main(String[] args) {

        int i = 0;
        Random random = new Random();
        boolean loopCondition = true;
        do {
            // i = i + random.nextInt(10);
            i += random.nextInt(10);
            System.out.println(i);
            if (i > 100) {
                loopCondition = false;
                System.out.println("while if");
            }
            System.exit(-1);
            System.out.println("while");
        }while (loopCondition);
        System.exit(1);
        System.out.println("Kod bitti");
    }

}
