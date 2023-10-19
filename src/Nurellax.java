import java.util.Scanner;

public class Nurellax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first variable");
        float firstNumberSaizildaeva = sc.nextFloat();
        System.out.println("Please enter second variable");
        float secondNumberSaizildaeva = sc.nextFloat();
        float sum = firstNumberSaizildaeva + secondNumberSaizildaeva;
        System.out.printf("sum = %.2f%n", sum);
        float difference = firstNumberSaizildaeva - secondNumberSaizildaeva;
        System.out.printf("difference = %.2f%n", difference);
        float product = firstNumberSaizildaeva * secondNumberSaizildaeva;
        System.out.printf("product = %.2f%n", product);
        float quotient = firstNumberSaizildaeva % secondNumberSaizildaeva;
        System.out.printf("quotient = %.2f", quotient);
    }
}
