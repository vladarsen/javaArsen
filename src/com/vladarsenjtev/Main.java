package com.vladarsenjtev;

/*
2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 -
те у которых сумма первых 3 цифр равна сумме последних 3
*/

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            String number = String.format("%06d", i);
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < 3; j++) {
                sum1 += number.charAt(j) - '0';
                sum2 += number.charAt(j + 3) - '0';
            }
            if (sum1 == sum2) {
                count++;
            }
        }
        System.out.println("Количество счасливых билетов: " + count);
    }
}
