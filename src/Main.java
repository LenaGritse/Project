import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //static Scanner sc;
    //static Random random;
    public static void main(String[] args) {

        /*
        public class Person {

    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }
}
         */
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "менеджер", "ivanov@mail.ru", "111-11-11", 5000 , 41);
        persArray[1] = new Person("Петров Петр Петрович", "старший менеджер", "petrov@mail.ru", "222-22-22", 10000 , 42);
        persArray[2] = new Person("Сидоров Иван Петрович", "помощник менеджера", "sidorov@mail.ru", "333-33-33", 15000 , 40);
        persArray[3] = new Person("Попова Мария Ивановна", "заместитель директора", "popova@mail.ru", "444-44-44", 20000 , 44);
        persArray[4] = new Person("Федоров Федор Федорович", "директор", "fedorov@mail.ru", "555-55-55", 25000 , 45);

            for (Person item : persArray) {
                if (item.getAge() > 39) {
                    item.info();
                }
            }


/*
        //тест заданий
        System.out.println(three(4,6,23,78));
        System.out.println(four(4,5));
        five(73);
        System.out.println(six(73));
        hello("Маша");
        whichYear(1265);
        //ДОМАШНЯЯ РАБОТА №2
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
        int[] arr = {3, 5, 4, 4};
        System.out.println(checkBalance(arr));
        //ДОМАШНЯЯ РАБОТА №3
        //sc = new Scanner(System.in);
        //random = new Random();
        //numsGame();
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

    //ДОМАШНЯЯ РАБОТА №4
    public static class XOGame {
        static final int SIZE = 3;
        static final int DOTS_TO_WIN = 3;

        static final char DOT_X = 'X';
        static final char DOT_O = 'O';
        static final char DOT_EMPTY = '.';

        static char[][] map;

        static Scanner sc = new Scanner(System.in);
        static Random random = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();

                if (checkWin(DOT_X)) {
                    System.out.println("Вы выиграли!");
                    break;
                }

                if (isFull()) {
                    System.out.println("Ничья");
                    break;
                }

                aiTurn();
                printMap();

                if (checkWin(DOT_O)) {
                    System.out.println("Компьютер победил!");
                    break;
                }

                if (isFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            System.out.print("  ");
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void humanTurn() {
            int x, y;

            do {
                System.out.println("Введите координаты Вашего хода X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(y, x));
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid(int y, int x) {
            if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
                return false;
            }
            return map[y][x] == DOT_EMPTY;
        }

        public static void aiTurn() {
            int x, y;

            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(y, x));
            map[y][x] = DOT_O;
        }

        public static boolean isFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean checkWin(char c) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (checkLine(i, j, 0, 1, c)) {
                        return true;
                    }
                    if (checkLine(i, j, 1, 1, c)) {
                        return true;
                    }
                    if (checkLine(i, j, 1, 0, c)) {
                        return true;
                    }
                    if (checkLine(i, j, -1, 1, c)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean checkLine(int y, int x, int lineY, int lineX, char c) {
            int X = x + (DOTS_TO_WIN - 1) * lineX;
            int Y = y + (DOTS_TO_WIN - 1) * lineY;
            if (X < 0 || Y < 0 || X > SIZE - 1 || Y > SIZE - 1) {
                return false;
            }
            for (int i = 0; i < DOTS_TO_WIN; i++) {
                int a = y + i * lineY;
                int b = x + i * lineX;
                if (map[a][b] != c) {
                    return false;
                }
            }
            return true;
        }
    }*/
    }
}