import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       calc(str);
    }
    public static String calc(String input) throws Exception {
        String[] numbers = input.split(" ");

        if (numbers.length > 3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (numbers.length < 3) {
            throw new Exception("Строка не является математической операцией");
        }

        String one = numbers[0];
        String x = numbers[1];
        String two = numbers[2];
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        int a = 0;
        int b = 0;
        int control = 0;
        int res;

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(numbers[0])) {
                a = i + 1;
                if (a > 10) {
                    throw new Exception("Введенные числа должны быть меньше 10");
                }
                control++;
            }
        }

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(numbers[2])) {
                b = i + 1;
                if (b > 10) {
                    throw new Exception("Введенные числа должны быть меньше 10");
                }
                control++;
            }
        }

        if (control == 0) {
            a = Integer.parseInt(one);
            b = Integer.parseInt(two);
        }

        if (a > 10 || b > 10) {
            throw new Exception("Введенные числа должны быть меньше 10");
        }

        switch (x) {
            case "+" -> {
                res = a + b;
                if (control == 2) {
                    if (res <= 0) {
                        throw new Exception("В римской системе нет отрицательных чисел и нуля");
                    } else {
                        input = roman[res-1];
                        System.out.println(input);
                    }
                }
                if (control == 1) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
                if (control == 0) {
                    input = Integer.toString(res);
                    System.out.println(input);
                }
            }
            case "-" -> {
                res = a - b;
                if (control == 2) {
                    if (res <= 0) {
                        throw new Exception("В римской системе нет отрицательных чисел и нуля");
                    } else {
                        input = roman[res-1];
                        System.out.println(input);
                    }
                }
                if (control == 1) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
                if (control == 0) {
                    input = Integer.toString(res);
                    System.out.println(input);
                }
            }
            case "*" -> {
                res = a * b;
                if (control == 2) {
                    if (res <= 0) {
                        throw new Exception("В римской системе нет отрицательных чисел и нуля");
                    } else {
                        input = roman[res-1];
                        System.out.println(input);
                    }
                }
                if (control == 1) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
                if (control == 0) {
                    input = Integer.toString(res);
                    System.out.println(input);
                }
            }
            case "/" -> {
                res = a / b;
                if (control == 2) {
                    if (res <= 0) {
                        throw new Exception("В римской системе нет отрицательных чисел и нуля");
                    } else {
                        input = roman[res-1];
                        System.out.println(input);
                    }
                }
                if (control == 1) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
                if (control == 0) {
                    input = Integer.toString(res);
                    System.out.println(input);
                }
            }
            default -> throw new Exception ("Не верный формат ввода");
        }
        return input;
    }
}


