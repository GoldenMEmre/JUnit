package day06_JUnitFramework;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethodlari {

    @Test
    public void test01(){

        int sayi1 = 20;
        int sayi2 = 10;
        int sayi3 = 30;


        Assert.assertTrue(sayi1>sayi2); //  sayi>sayi2 PASSED

        Assert.assertFalse(sayi1>sayi3);

        Assert.assertTrue(sayi1<sayi3);
    }
}
