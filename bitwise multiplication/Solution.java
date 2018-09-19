package com.javarush.task.task39.task3902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Биты были биты
*/
/*Требования:
1. Метод isWeightEven должен возвращать true, если количество единиц в двоичном представлении анализируемого числа четное.
2. Метод isWeightEven должен возвращать false, если количество единиц в двоичном представлении анализируемого числа нечетное.
3. Время выполнения метода isWeightEven должно быть максимально близко к оптимальному.
4. Метод isWeightEven должен быть публичным и статическим.*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please type in a number: ");

        long l = Long.parseLong(reader.readLine());
        String result = isWeightEven(l) ? "even" : "odd";
        System.out.println("Number of ones in a given number is " + result);

    }

    public static boolean isWeightEven(long number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number & (number - 1);
        }
        if (count % 2 == 0) return true;
        return false;
    }
}
