package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Sergey Sergeev";
        names[3] = "Andrey Andreev";
        for (String s : names) {
            System.out.println(s);
        }
    }
}
