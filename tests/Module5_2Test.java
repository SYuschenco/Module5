import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Module5_2Test {

    @Test(timeout = 1000)
    public void tesBubleSort(){
        int[] a = {0,2,1};
        int[] b = {0,1,2};
        int[] d = Module5_2.bubleSort(a);
        if(Arrays.equals(b,d) != true) Assert.fail();
    }



}