package by.epam.unit03.main;

public class Task04 {
    public static void main(String[] args) {
        double y;

        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%6s\t|\n", "x", "y");
        System.out.println("---------------------------------");
        for (double i = -5; i <= 5; i += 0.5) {
            y = 5 - Math.pow(i, 2) / 2;
            System.out.printf("|\t%4.1f\t|\t%6.3f\t|\n", i, y);
        }
        System.out.println("---------------------------------");
    }
}
