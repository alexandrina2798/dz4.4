package com.company;

import java.util.*;
import main.java.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("**********************************************************************************");
        System.out.println("Добрый день! Это целочисленный калькулятор для пусечек и котиков, вот правила:");
        System.out.println("Для подсчета введите операцию, которую нужно выполнить с пробелами!");
        System.out.println("Пример: 5 + 2. Пожалуйста, не игнорируйте пробелы, 5+2 - некорректная команда.");
        System.out.println("Еще раз!");
        System.out.println("Вот так вот не надо! 5+2");
        System.out.println("Надо вот так, так, так, понятно? 5 + 2");
        System.out.println();
        System.out.println("Когда надоест, введите exit");
        System.out.println("Удачи");
        System.out.println("**********************************************************************************");
        System.out.println();
        System.out.println("Введите операцию, которую нужно посчитать : ");

        int a = 0;
        int b = 0;
        String operation = "";

        Scanner in = new Scanner(System.in);

        while(true){

            String str = in.next();

            if (str.equals("exit"))
            {
                break;
            }
            else
            {
                a = Integer.parseInt(str);
                operation = in.next();
                b = in.nextInt();
            }

            //System.out.println("Ваша строка: " + a + operation + b);

            switch(operation){
                case "+":
                    new Plus().execute(a, b);
                    break;
                case "-":
                    new Minus().execute(a, b);
                    break;
                case "*":
                    new Multi().execute(a, b);
                    break;
                case "/":
                    new Division().execute(a, b);
                    break;
                default:
                    new Operation().execute(a, b);
                    break;
            }

            System.out.println("Для выхода введите exit, либо давайте считать дальше!");

        }
        in.close();
        System.out.println("Спасибо, все свободны.");

    }
}
