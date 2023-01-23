public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        double x = 8.7;
        double y = 9.1;
        double z = 10.7;
        Summa summa = new Summa();
        System.out.println("Сумма int от 2х переменных int = " + Summa.sum(a,b));
        System.out.println("Сумма double от 3х переменных int = " + Summa.sum(a,b,a+b));
        System.out.println("Сумма double от 2х переменных double = " + Summa.sum(x,y,z));
        System.out.println("Сумма double от 3х переменных double = " + Summa.sum(x,y));
        System.out.println("Сумма double от 1 int и от 2х переменных double = " + Summa.sum(a,x,y));
        System.out.println("Сумма double из 2х переменных типа Integer = " + Summa.sum(a,b));
    }
}
