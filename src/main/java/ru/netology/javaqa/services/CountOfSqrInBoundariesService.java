package ru.netology.javaqa.services;
public class CountOfSqrInBoundariesService {
    public int calcCountSqr(int bottom, int top) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottom && i*i<=top) {
                count = count + 1;
            }

        }
        return count;
    }
}
