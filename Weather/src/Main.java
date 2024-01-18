import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрый день, эта программа переводит градусы по Цельсию в Фаренгейты");
        System.out.println("Давайте сначала познакомимся: ");

        String people = scanner.nextLine();

        System.out.println("Привет," + people);

        System.out.println("Перейдём к погоде, напиши градусы Цельсия: ");

        double number = scanner.nextDouble();

        double result = number * 1.8 + 32;

        System.out.println("Фаренгейт вашего числа " + result);

        System.out.println("Хорошего дня)");


    }
}