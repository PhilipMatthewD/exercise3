import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tempF = 0;
        while (tempF > -460) {
            tempF = grabInput();
            exportResponse(tempF);
        }
    }
    static double exportResponse (double a){
        System.out.println("The temperature in celcius is " + convertC(a));
        return a;
    }
    static double grabInput (){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature in Ferenheit?");
        double tempF = input.nextDouble();
        return tempF;
    }
    static double convertC (double a){
        a = (a - 32) * 5 / 9;
        return a;
    }
}
