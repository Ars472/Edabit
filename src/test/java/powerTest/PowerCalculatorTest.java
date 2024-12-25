package powerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import power.PowerCalculator;

public class PowerCalculatorTest {
@Test
    public void testPower(){
    Assert.assertEquals(PowerCalculator.power(230,10),2300);
    Assert.assertEquals(PowerCalculator.power(110,3),330);
    Assert.assertEquals(PowerCalculator.power(480,20),9600);
}

}
