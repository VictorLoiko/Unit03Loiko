package by.epam.unit03.main;

public class Task06 {
    public static void main(String[] args) {
        int a, b,tmp;
        String duplicates;

        a = 574653031;
        b = 243118633;
        duplicates = "";
        System.out.println("Повторяющиеся цифры: ");
        while (a!=0){
            tmp=b;
            while(tmp!=0){
                if(duplicates.contains(Integer.toString(a%10))){
                    break;
                }
                else if(a%10==tmp%10) {
                    duplicates = duplicates+a%10+" ";
                    break;
                }
                tmp/=10;
            }
            a/=10;
        }
        System.out.println(duplicates);
    }
}
