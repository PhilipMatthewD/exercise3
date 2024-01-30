import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempF = 0;
        while (tempF > -460) {
            System.out.println("What is the temperature in Ferenheit?");
            tempF = input.nextDouble();
            System.out.println("The temperature in celcius is " + convertC(tempF));
        }
    }
    public static double convertC (double a){
        a = (a - 32) * 5 / 9;
        return a;
    }
}