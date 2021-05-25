package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        double x, y, z;
        String input;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите операнд X: ");
            input = sc.nextLine();
            if (input.equals("#")) break;
            x = Double.parseDouble(input);
            System.out.print("Введите операнд Y: ");
            input = sc.nextLine();
            if (input.equals("#")) break;
            y = Double.parseDouble(input);
            System.out.print("Введите знак операции (+, –, /, *) : ");
            input = sc.nextLine();
            if (input.equals("#")) break;
            switch (input) {
                case "+":
                    z = x + y;
                    break;
                case "-":
                    z = x - y;
                    break;
                case "*":
                    z=x*y;
                    break;
                case "/":
                    z = (y != 0) ? x / y : Double.NaN;
                    break;
                default:
                    System.out.println("Неверный знак операции!");
                    continue;
            }
            String output = (Double.isNaN(z)) ? "На ноль делить нельзя!" : "Результат операции: "+z;
            System.out.println(output);
        }
    }
}
