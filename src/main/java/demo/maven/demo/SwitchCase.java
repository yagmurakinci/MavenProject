package demo.maven.demo;

public class SwitchCase {


    public SwitchCase(){

    }

    public String switchCaseExample1(String not){
        
        not = not.substring(6);
        System.out.println(not);
        not = not.replace("\n","");
        System.out.println(not);
        not = not.trim();
        System.out.println(not);
        StringBuilder stringBuilder = new StringBuilder();
        for (char a: not.toCharArray()){
            a = switchCaseMethod1(a);
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public String switchCaseExample2(String not){

        not = not.substring(6);
        System.out.println(not);
        not = not.replace("\n","");
        System.out.println(not);
        not = not.trim();
        System.out.println(not);
        StringBuilder stringBuilder = new StringBuilder();
        for (char a: not.toCharArray()){
            a = ifMethod1(a);
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public char switchCaseMethod1(char a){

        switch (a){
            case 'İ':
                System.out.println("case");
                a = 'I';
                break;
            case 'ı':
                System.out.println("case");
                a = 'i';
                break;
            case 'ç':
                System.out.println("case");
                a = 'c';
                break;
            case 'Ç':
                System.out.println("case");
                a = 'C';
                break;
            case 'Ü':
                System.out.println("case");
                a = 'U';
                break;
            case 'ü':
                System.out.println("case");
                a = 'u';
                break;
            case 'Ğ':
                System.out.println("case");
                a = 'G';
                break;
            case 'ğ':
                System.out.println("case");
                a = 'g';
                break;
            case 'Ö':
                System.out.println("case");
                a = 'O';
                break;
            case 'ö':
                System.out.println("case");
                a = 'o';
                break;
            case 'Ş':
                System.out.println("case");
                a = 'S';
                break;
            case 'ş':
                System.out.println("case");
                a = 's';
                break;
            default:
                System.out.println("case");
        }
        return a;
    }

    public char ifMethod1(char a) {
    
        String value = String.valueOf(a);
        if(printLog(value,"İ")){
            a = 'I';
        }else if (printLog(value,"ı")){
            a = 'i';
        } else if (printLog(value,"Ç")) {
            a = 'C';
        } else if (printLog(value,"ç")) {
            a = 'c';
        }else if (printLog(value,"Ü")) {
            a = 'U';
        }else if (printLog(value,"ü")) {
            a = 'u';
        } else if (printLog(value,"Ğ")) {
            a = 'G';
        } else if (printLog(value,"ğ")) {
            a = 'g';
        } else if (printLog(value,"Ö")) {
            a = 'O';
        }else if (printLog(value,"ö")) {
            a = 'o';
        }else if (printLog(value,"Ş")) {
            a = 's';
        }else if (printLog(value,"ş")) {
            a = 's';
        }
        return a;
    }
    
    public boolean printLog(String value1, String value2){

        System.out.println("if");
        return value1.equals(value2);
    }
    
    public void waitByMillisSecond(long millis)  {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
