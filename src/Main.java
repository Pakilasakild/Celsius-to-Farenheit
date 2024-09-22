import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many degrees in Celsius: ");
        double degreesInCelsius = sc.nextDouble();
        int degreesInFahrenheit = (int) (degreesInCelsius * 1.8 + 32);
        if (degreesInCelsius > 30) {
            System.out.println("hot");
        }
        else if (degreesInCelsius <= 30) {
            System.out.println("cold");
        }
    }
}