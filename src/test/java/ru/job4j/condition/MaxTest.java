package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And2And3Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5And2And1Then5() {
        int one = 5;
        int two = 2;
        int three = 1;
        int result = Max.max(one, two, three);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And6And3Then6() {
        int one = 1;
        int two = 6;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And6And3And10Then10() {
        int one = 1;
        int two = 6;
        int three = 3;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10And6And3And1Then10() {
        int one = 10;
        int two = 6;
        int three = 3;
        int four = 1;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And10And3And2Then10() {
        int one = 1;
        int two = 10;
        int three = 3;
        int four = 2;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And6And30And10Then30() {
        int one = 1;
        int two = 6;
        int three = 30;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }
}