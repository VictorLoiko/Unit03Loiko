package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int i;
        String roman;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите римскую цифру (I, V, X, L, C, D, M) : \n> ");
        roman = sc.nextLine();
        switch (roman) {
            case "I":
                i = 1;
                break;
            case "V":
                i = 5;
                break;
            case "X":
                i = 10;
                break;
            case "L":
                i = 50;
                break;
            case "C":
                i = 100;
                break;
            case "D":
                i = 500;
                break;
            case "M":
                i = 1000;
                break;
            default:
                System.out.println("Внимательно читайте условие!");
                return;
        }
        System.out.println("Арабский аналог вашей цифры: " + i);
    }
}
