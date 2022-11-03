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

    @Test
    public void when901to201then7() {
        double expected = 7;
        Point pointone = new Point(9, 0, 1);
        Point pointtwo = new Point(2, 0, 1);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when725to187then8dot48() {
        double expected = 8.48;
        Point pointone = new Point(7, 2, 5);
        Point pointtwo = new Point(1, 8, 7);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1915to1591then14() {
        double expected = 14;
        Point pointone = new Point(1, 9, 15);
        Point pointtwo = new Point(15, 9, 1);
        double out = pointone.distance(pointtwo);
        Assert.assertEquals(expected, out, 0.01);
    }
}