public class Main {
    public static void main(String[] args) {
//тест заданий
        System.out.println(three(4,6,23,78));
        System.out.println(four(4,5));
        five(73);
        System.out.println(six(73));
        hello("Маша");
        whichYear(1265);
        //задание №2
        byte a;
        a = -120;
        short b;
        b = 12442;
        int c;
        c = 1000;
        long d;
        d = 200000L;
        float e;
        e = 12.23f;
        double f;
        f = -123.123;
        char g;
        g = 1067;
        boolean h;
        h = false;
    }
    //задание №3
    public static int three(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    //задание №4
    public static  boolean four(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    //задание №5
    public static void five(int a) {
        if (a % 2 == 0 || a == 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    //задание №6
    public static boolean six(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //задание №7
    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }
    //задание №8
    public static void whichYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год невисокосный");
        }
    }
}