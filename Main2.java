//public class Main {
//    public static void main(String[] args) {
//
//        int a = 6;
//        int b = 5;
//        int c = 8;
//
//        System.out.println("Сумма: " + (a + b + c));
//        System.out.println("Разность: " + (a - b - c));
//        System.out.println("Произведение: " + (a * b * c));
//        System.out.println("Деление: " + (a / b));
//        System.out.println("Остаток от деления: " + (a % b));
//    }
//}

public class Main {
    public static void main(String[] args) {

        int number = 345;

        int number1 = number / 100;
        int number2 = (number / 10) % 10;
        int number3 = number % 10;

        System.out.println("Число " + number + " -> " + number1 + ", " + number2 + ", " + number3);

    }
}
