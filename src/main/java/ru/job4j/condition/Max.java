package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static int max(int one, int two, int three) {
        int m = max(one, two);
        return m > three ? m : three;
    }

    public static int max(int one, int two, int three, int four) {
        int m = max(one, two, three);
        return m > four ? m : four;
    }
}