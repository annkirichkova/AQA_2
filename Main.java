import java.util.Arrays;

public class Main {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 75;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println(number + " - положительное число");
        } else {
            System.out.println(number + " - отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] fillArray1To100() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] multiplyIfLessThan6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    public static int[][] fillDiagonals(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        printThreeWords();

        System.out.println("\nЗадание 2");
        checkSumSign();

        System.out.println("\nЗадание 3");
        printColor();

        System.out.println("\nЗадание 4");
        compareNumbers();

        System.out.println("\nЗадание 5");
        System.out.println("Сумма 5 и 7 в диапазоне 10-20? " + isSumInRange(5, 7));
        System.out.println("Сумма 10 и 5 в диапазоне 10-20? " + isSumInRange(10, 5));

        System.out.println("\nЗадание 6");
        printNumberSign(10);
        printNumberSign(-5);
        printNumberSign(0);

        System.out.println("\nЗадание 7");
        System.out.println("10 отрицательное? " + isNegative(10));
        System.out.println("-5 отрицательное? " + isNegative(-5));
        System.out.println("0 отрицательное? " + isNegative(0));

        System.out.println("\nЗадание 8");
        printStringMultipleTimes("Hello Java!", 3);

        System.out.println("\nЗадание 9");
        System.out.println("2024 високосный? " + isLeapYear(2024));
        System.out.println("2023 високосный? " + isLeapYear(2023));
        System.out.println("1900 високосный? " + isLeapYear(1900));
        System.out.println("2000 високосный? " + isLeapYear(2000));

        System.out.println("\nЗадание 10");
        int[] array10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(array10));
        System.out.println("Инвертированный: " + Arrays.toString(invertArray(array10)));

        System.out.println("\nЗадание 11");
        int[] array11 = fillArray1To100();
        System.out.println("Первые 10 элементов массива 1-100: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array11[i] + " ");
        }
        System.out.println("...");

        System.out.println("\nЗадание 12");
        int[] array12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array12));
        System.out.println("После умножения: " + Arrays.toString(multiplyIfLessThan6(array12)));

        System.out.println("\nЗадание 13");
        int[][] matrix13 = fillDiagonals(5);
        System.out.println("Матрица 5x5 с диагоналями:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix13[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗадание 14");
        int[] array14 = createArray(5, 7);
        System.out.println("Массив длиной 5 со значением 7: " + Arrays.toString(array14));
    }
}