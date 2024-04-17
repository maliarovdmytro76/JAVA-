//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое слово:");
//        String word1 = scanner.next();
//        System.out.println("Введите второе слово:");
//        String word2 = scanner.next();
//
//        String result = getCombinedWord(word1, word2);
//        System.out.println("Результат: " + result);
//    }
//
//    public static String getCombinedWord(String word1, String word2) {
//        int halfLength1 = word1.length() / 2;
//        int halfLength2 = word2.length() / 2;
//        String combinedWord = word1.substring(0, halfLength1) + word2.substring(halfLength2);
//        return combinedWord;
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат сложения: " + add(10, 7));
        System.out.println("Результат вычитания: " + subtract(10, 7));
        System.out.println("Результат умножения: " + multiply(10, 7));
        System.out.println("Результат деления: " + divide(10, 7));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println();
            return 0;
        }
    }
}