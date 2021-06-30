import org.junit.Assert;
import org.junit.Test;

public class RangeTest {

    private String firstRange = "(3,6)";

    @Test // (3 , 6 ) = (3,6)  no contains [7,10]
    public void split_Range(){
        Range r1 = new Range("(3,6)");
        Range r2 = new Range("[7,10]");
        boolean actual = r1.notContains(r2);
        Assert.assertFalse(actual);
    }


}
