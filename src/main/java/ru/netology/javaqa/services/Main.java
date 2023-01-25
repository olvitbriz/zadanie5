package ru.netology.javaqa.services;

public class Main {
    public static void main(String[] args) {
        CountOfSqrInBoundariesService service= new CountOfSqrInBoundariesService();

        System.out.println(service.calcCountSqr(200,300));
    }
}