package ru.netology.javaqa.services;
public class SquareService {
    public int calculate(int min, int max) {
        int x = min;
        int y = max;
        int a = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) & (i * i <= max)) {
                a = a + 1;
            }
        }
        return a;
    }
}


