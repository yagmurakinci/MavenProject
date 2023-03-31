package demo.maven.demo;

import java.util.Random;

public class WhileDemo {

    public static void main(String[] args) {

        int i = 0;
        Random random = new Random();
        /*
        while (true){

           // i = i + random.nextInt(10);
            i += random.nextInt(10);
            System.out.println(i);
            if (i > 100){
                break;
            }
        }*/

        boolean loopCondition = true;
        while (loopCondition){

            // i = i + random.nextInt(10);
            i += random.nextInt(10);
            System.out.println(i);
            if (i > 100){
                loopCondition = false;
            }
        }
    }


}
