package ru.levelup.Vadim.Sorokin.qa.homework_1;

import java.util.Scanner;

class Operation { //создаем класс Operation для задания имен Num1 и Num2
    public int Num1;
    public int Num2;

    public Operation(int num1, int num2) {
        this.Num1 = num1;
        this.Num2 = num2;
    }

    public int calc() {
        return 0;
    }
}

class sum extends Operation { // наследование класса Operation. отдельный класс для суммирования
    public sum(int num1, int num2) {
        super(num1, num2);
    }

    public int calc() {
        return this.Num1 + this.Num2;
    }

}

class subtract extends Operation { // наследование класса Operation. отдельный класс для вычитания
    public subtract(int num1, int num2) {
        super(num1, num2);
    }

    public int calc() {
        return this.Num1 - this.Num2;
    }
}

class multiply extends Operation { // наследование класса Operation. отдельный класс для умножения
    public multiply(int num1, int num2) {
        super(num1, num2);
    }

    public int calc() {
        return this.Num1 * this.Num2;
    }
}

class dividing extends Operation { // наследование класса Operation. отдельный класс для деления
    public dividing(int num1, int num2) {
        super(num1, num2);
    }

    public int calc() {
        return this.Num1 / this.Num2;
    }
}

public class task_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt(1);
        int num2 = getInt(2);
        char operation = getOperation();
        Operation calculator = getCalculator(num1, num2, operation);
        System.out.println("Результат операции: " + calculator.calc());
    }

    public static int getInt(int index) {
        System.out.println("Введите число " + index + ":");
        int num = scanner.nextInt();
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    /*  static int power(int num1, int num2){ //степень
          int result = 1;
          for (int i=1; i<=num2; i++){
              result = result*num1;
          }
          return result;
      }
      static int powerK(int num1){ //факториал
          int result = 1;
          for (int i=1; i<=num1; i++){
              result = result*i;
          }
          return result;
      }

      static void powerC(int num1){ //фибоначи
          int a = 1;
          int b = 1;
          int c;
          System.out.print(a+" "+b+" ");
          for(int i = 3; i <= num1; i++){
              c=a+b;
              System.out.print(c+" ");
              a=b;
              b=c;
          }
          System.out.println();
      }
  */
    public static Operation getCalculator(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return new sum(num1, num2);

            case '-':
                return new subtract(num1, num2);

            case '*':
                return new multiply(num1, num2);

            case '/':
                return new dividing(num1, num2);

/*            case 's'://степень
                result = power(num1,num2);
                break;
            case 'k'://факториал
                result = powerK(num1);
                break;
            case 'c'://фибоначи
                powerC(num1);
                result = 0;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
 */
        }


        return null;
    }
}
/*
    public static int calc2(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case 's'://степень
                result = power(num1,num2);
                break;
            case 'k'://факториал
                result = powerK(num1);
                break;
            case 'c'://фибоначи
                powerC(num1);
                result = 0;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}

 */