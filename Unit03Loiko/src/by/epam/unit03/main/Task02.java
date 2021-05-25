package by.epam.unit03.main;

public class Task02 {
    public static void main (String[] args){
        int i,sum;

        i=1;
        sum=0;
        while(i<=99){
            if(i%2!=0)
                sum+=i;
            i++;
        }

        System.out.println("Сумма нечетных чисел в диапазоне [1,99] равна "+sum);
    }
}
