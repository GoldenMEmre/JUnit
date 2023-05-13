package practice;

import org.junit.*;

public class P01 {
    /*
      @BeforeClass //Sadece bir kere çalışıyor
      @Before //
      @AfterClass
      @After
      @Test
     */
    @Test
    public void test01() {
        System.out.println("test 01");
    }

    @Test
    public void test02() {
        System.out.println("Test 02");
    }

    @Test
    public void test03() {
        System.out.println("test 03");

    }
}