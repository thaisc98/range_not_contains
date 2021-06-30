import org.junit.Assert;
import org.junit.Test;

public class RangeTest {

    private String firstRange = "(3,6)";

    @Test // (3 , 6 ) = (3,6) = [4,5]  no contains [7,10]
    public void not_Cotains_Range_On_Other_Range(){
        Range r1 = new Range("(3,6)");
        Range r2 = new Range("[5,10]");
        boolean actual = r1.notContains(r2);
        Assert.assertTrue(actual);
    }

    @Test  // (3 , 6 ) = (3,6) = [4,5]  no contains [7,10]
    public void not_Contains_Range_Is_False(){
        Range r1 = new Range("(3,10)");
        Range r2 = new Range("[5,8]");
        boolean actual = r1.notContains(r2);
        Assert.assertFalse(actual);
    }


}
