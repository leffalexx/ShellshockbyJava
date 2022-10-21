package Homework_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hanoitower {

    public static int ui() throws InputMismatchException{
        System.out.println("Сколько дисков в игре?");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try{
            i = sc.nextInt();
            System.out.println("Выводим алгоритм для " + i + " дисков: ");
        }catch(InputMismatchException e){
            sc.next();
            System.out.println("Вы ввели не число. Попробуйте снова.");
        }
        sc.close();
        return i;
    }

    public static void solution(int n, char a, char c, char b) {
        if (n > 1){
            solution(n - 1, a, b, c);
        }
        System.out.printf("Переместите диск с %c на %c \n", a, c);
        if (n > 1){
            solution( n - 1, b, c, a);
        }
    }
    
    public static void main(String[] args) {
        int n = ui();
        char mainRod = 'A';
        char auxRod = 'B';
        char toRod = 'C';
        solution(n, mainRod, toRod, auxRod);
    }
}
