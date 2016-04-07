//    Покрыть юнит-тестами код к домашним заданиям лекций №4, №5, №9 и №10.
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class Module5_1Test {

    private static FinderMinAndMaxElementOfArray s;

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void setUpClass() throws Exception {
        s = new FinderMinAndMaxElementOfArray();
        System.out.println("\nsetUpClass method called!\n");
    }

    @org.junit.Test
    public void testFindMinElementOfArray() throws Exception {
        int exp = -999;
        assertEquals(exp, s.findMinElementOfArray(s.arr1),0);
    }

    @org.junit.Test
    public void testFindMaxElementOfArray() throws Exception {
        int exp = 12;
        assertEquals(exp, s.findMaxElementOfArray(s.arr1), 0);
    }



}