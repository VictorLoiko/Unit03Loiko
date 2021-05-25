package by.epam.unit03.main;

public class Task05 {
    public static void main (String[] args){
        double y,x,a,b,h;

        a=2;
        b=6;
        h=0.5;

        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%8s\t|\n", "x", "F(x)");
        System.out.println("---------------------------------");

        for (x=a;x<=b;x+=h){
            y=2*Math.tan(x/2)+1;
            System.out.printf("|\t%4.1f\t|\t%8.3f\t|\n", x, y);
        }

        System.out.println("---------------------------------");
    }
}
