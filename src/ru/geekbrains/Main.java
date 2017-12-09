package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {        
        int repeatQuestion = 1;
        here: while(repeatQuestion!=0){
            System.out.println("Последовательно через Enter введите число и его степень");
            int number = scanner.nextInt();
            int degree = scanner.nextInt();
            int k = 1;
            here2:while (degree>1){
                if (degree%2 == 0) {
                    number = number*number;
                    degree = degree/2;
                    continue here2;
                }else{
                    degree--;
                    k = k*number;
                    continue here2;
                }
            }
            System.out.println(number*k);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion==1) continue here;
            else break;
        }
    }
}
