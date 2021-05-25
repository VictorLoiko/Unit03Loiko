package by.epam.unit03.main;

public class Task03 {
    public static void main(String[] args) {
        int factor;
        long result;

        factor=1;
        result=1;
        for (int i = 2; i<=10;i++){
            factor+=i;
            result*=factor;
        }

        System.out.println("Результат выражения: "+result);
    }
}
