package Task_1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {



        double  num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат:" + result );
}



    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число:");
        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Помилка при вводі. Повторіть");
            return getNumber();
        }
    }


    public  static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть дію:\n1 - Додати\n2 - Відняти\n3 - Помножити\n4 - Поділити");
        int operationNumber = 0;
        if(sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
            System.out.println("Ви вели не число! Повторіть ввід даних ");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильна дія! повторіть ввід!");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public  static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public  static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public  static double divide(double num1, double num2) {
        if(num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("На 0 ділити не можна!");
            return Double.NaN;
        }
    }

    public  static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                return Double.NaN;
        }

    }


}
