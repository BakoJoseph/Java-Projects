import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        double result = calculator.add(2.0, 2.0);
        Assert.assertEquals(3.0, result, 0);
    }
}
