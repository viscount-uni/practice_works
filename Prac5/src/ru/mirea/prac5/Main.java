package ru.mirea.prac5;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //System.out.println(recursion1(a, 2));
        recursion3(a, 2);

    }
    /*Даны два целых числа A и В (каждое в отдельной строке). Выведите все
    числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
    убывания в противном случае.*/
    private static void recursive(int a, int b){
        System.out.println(a);
        if (a > b) {
            recursive(a-1, b);
        }
        else if (a<b){
            recursive(a+1, b);
        }
    }

    /*Дано натуральное число N. Вычислите сумму его цифр*/
    private static int recursive1(int N){
        if(N == 0)
            return N;
        return N%10 + recursive1(N/10);
    }

    /*Даны натуральные числа k и s. Определите, сколько существует k-значных
    натуральных чисел, сумма цифр которых равна d. Запись натурального числа не
    может начинаться с цифры 0.
    В этой задаче можно использовать цикл для перебора всех цифр, стоящих
    на какой-либо позиции*/

    public static int recursion(int currentPos, int sum, int k, int s) {

        if (currentPos == k) {
            if (sum == s)
                return 1;
             else
                return 0;

        }
        int c = (currentPos == 0 ? 1 : 0);
        int res = 0;

        for (int i = c; i < 10; i++) {
            res += recursion(currentPos + 1, sum + i, k, s);
        }
        return res;
    }
//    Дано натуральное число n>1. Проверьте, является ли оно простым.
//    Программа должна вывести слово YES, если число простое и NO, если число
//    составное. Алгоритм должен иметь сложность O(logn).
//    Указание. Понятно, что задача сама по себе нерекурсивна, т.к. проверка
//    числа n на простоту никак не сводится к проверке на простоту меньших чисел.
//    Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно
//    по этому параметру и делать рекурсию.
    public static boolean recursion1(int n, int i) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % i == 0)
            return false;
        else if (i < n / 2)
            return recursion1(n, i + 1);
        else
            return true;
    }

   /* Дано натуральное число n>1. Выведите все простые множители этого
    числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
    сложность O(logn*/
    public static void recursion3(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion3(n / k, k);
        }
        else {
            recursion3(n, ++k);
        }
    }

}

