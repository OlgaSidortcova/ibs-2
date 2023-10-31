import java.util.Scanner;

/**
 * @autor Sidostsova Olga
 */

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное с точкой - разделителем дробной части ");

        double i = scanner.nextDouble();

        System.out.println("Введите второе дробное число с точкой - разделителем дробной части ");
        double j = scanner.nextDouble();

        System.out.println("Сумма двух чисел, округленная до 4-х знаков после запятой");

        System.out.printf("%.4f", i + j);
        scanner.close();
    }
}