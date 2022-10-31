package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point pointone = new Point(0, 0);
        Point pointtwo = new Point(2, 0);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to70then5dot38() {
        double expected = 5.38;
        Point pointone = new Point(5, 5);
        Point pointtwo = new Point(7, 0);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to23then1dot41() {
        double expected = 1.41;
        Point pointone = new Point(3, 2);
        Point pointtwo = new Point(2, 3);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when90to20then7() {
        double expected = 7;
        Point pointone = new Point(9, 0);
        Point pointtwo = new Point(2, 0);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }
}