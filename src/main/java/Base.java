import java.util.Scanner;

/**
 * @autor Sidostsova Olga
 */

public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер задачи (1 - калькулятор, 2 - массив слов) ");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                calc(scanner);
                break;
            case 2:
                maxElemInArrayString(scanner);
                break;
            default:
                System.out.println("Вы ввели неверное значение");
        }
        scanner.close();
    }

    public static void calc(Scanner scanner) {
        System.out.println("Введите первое дробное с точкой - разделителем дробной части ");
        double i = scanner.nextDouble();

        System.out.println("Введите второе дробное число с точкой - разделителем дробной части ");
        double j = scanner.nextDouble();

        System.out.println("Введите операцию калькулятора:\n 1 - умножение,\n 2 - сложение,\n" +
                                                           " 3 - вычитание,\n 4 - деление");
        int math_oper = scanner.nextInt();

        System.out.println("Результат операции ");
        switch (math_oper) {
            case 1:
                System.out.printf("%.4f", i * j);
                break;
            case 2:
                System.out.printf("%.4f", i + j);
                break;
            case 3:
                System.out.printf("%.4f", i - j);
                break;
            case 4:
                if (j == 0) {
                    System.out.println("Делить на ноль нельзя");
                } else
                    System.out.printf("%.4f", i / j);
                break;
            default:
                System.out.println("Вы ввели нкорректное значение операции");
        }
    }

    public static void maxElemInArrayString(Scanner scanner) {
        System.out.println("Введите длинну массива ");
        int count = scanner.nextInt();

        if (count > 0) {
            System.out.println("Заполните массив");
            String[] array = new String[count + 1];
            String maxString = "";
            int lengthMaxString = 0;

            for (int i = 0; i < count; i++) {
                array[i] = scanner.next();
                if (array[i].length() > lengthMaxString) {
                    lengthMaxString = array[i].length();
                    maxString = array[i];
                }
            }
            System.out.println("Самое длинное слово в массиве: " + maxString);
        } else System.out.println("В пустом массиве отсутствует понятие самого длинного слова");
    }
}