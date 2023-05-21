package Practices.practice_BabayigitHoca;

import org.junit.*;

public class P02 {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class Çalıştı. Testler Çalıştırılacak");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class Çalıştı. testlerin Çalıştırılması Bitti");
    }

    @Before
    public static void before() {
        System.out.println("Yeni Bir Test Çalıştırılıyor");
    }

    @After
    public static void after() {
        System.out.println("Çalıştırılan Test Sonlandırılıyor");
        System.out.println("=====================================");
    }

    @Test
    public void test01() {
        System.out.println("Test Case 01 Çalıştırıldı");
    }

    @Test
    public void test02() {
        System.out.println("Test Case 02 Çalıştırıldı");
    }

    @Test
    public void test03() {
        System.out.println("Test Case 03 Çalıştırıldı");

    }
}
