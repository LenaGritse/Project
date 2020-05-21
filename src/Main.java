import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Random random;
    public static void main(String[] args) {
//тест заданий
       /* System.out.println(three(4,6,23,78));
        System.out.println(four(4,5));
        five(73);
        System.out.println(six(73));
        hello("Маша");
        whichYear(1265);*/
        //ДОМАШНЯЯ РАБОТА №2
        /*invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
        int[] arr = {3, 5, 4, 4};
        System.out.println(checkBalance(arr));*/
        //ДОМАШНЯЯ РАБОТА №3
        sc = new Scanner(System.in);
        random = new Random();
        numsGame();
        //задание №2
       /* byte a;
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
        h = false;*/
    }

    //задание №3
    public static int three(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //задание №4
    public static boolean four(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //задание №5
    public static void five(int a) {
        if (a % 2 == 0 || a == 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //задание №6
    public static boolean six(int a) {
        if (a < 0) {
            return true;
        } else {
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
        } else {
            System.out.println("Год невисокосный");
        }
    }

    //ДОМАШНЯЯ РАБОТА №2
    //задание №1
    public static void invertArray() {
        int[] arr = {1, 1, 1, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //задание №2
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++) {
            arr[i] = j;
            j = j + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //задание №3
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }

    //задание №4
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, j2 = arr[i].length; j < arr[i].length; j++, j2--) {
                if(i == j || i == (j2 - 1)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //задание №5
    public static void minMax() {
        int[] arr = {12, 84, 30, 55, 8, 96};
        int min;
        min = arr[0];
        int max;
        max = min;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение - " + min + ", " + "максимальное - " + max);
    }

    //задание №6
    public static boolean checkBalance(int[] arr) {
        int a;
        int b;
        for (int i = 0; i < arr.length + 1; i++) {
            a = 0;
            b = 0;
            for (int j = 0; j < i; j++) {
                a += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                b += arr[j];
            }
            if (a == b) {
                return true;
            }
        }
        return false;
    }

    //задание №7
    public static int[] shiftArr(int[] arr, int n) {
        int k = n % arr.length + arr.length;
        for (int i = 0; i < k; i++) {
            int tmp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = tmp;
        }
        return arr;
    }

    //ДОМАШНЯЯ РАБОТА №3
    //задание №1
    public static void numsGame() {
        do {
            int answer = random.nextInt(10);
            System.out.println("Попробуйте угадать число от 0 до 9. У Вас 3 попытки.");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите число: ");
                int userAnswer = sc.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю! Вы угадали!");
                    break;
                }
                System.out.println(userAnswer > answer ? "Указанное Вами число больше загаданного" : "Указанное Вами число меньше загаданного");
                System.out.println((i-1) > 0 ? "Осталось попыток: " + (i-1) : "Вы использовали все попытки. Игра окончена.\nВерный ответ - " + answer);
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        }
        while (sc.nextInt() == 1);
    }

}