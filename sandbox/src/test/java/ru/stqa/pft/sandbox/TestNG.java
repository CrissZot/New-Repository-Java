package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void testDistance() {
        Point pp1 = new Point(10,5 );
        Point pp2 = new Point(20,11 );
        Assert.assertEquals(pp1.distance(pp2), 11.661903789690601);
    }

    @Test
    public void testDistance1() {
        Point ppp1 = new Point(70, 1);
        Point ppp2 = new Point(30, 21);
        Assert.assertEquals(ppp1.distance(ppp2), 44.721359549995796);
    }


}