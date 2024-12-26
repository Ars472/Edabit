package pinTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pin.PinValidator;

public class PinValidatorTest {
    @Test
    public void testValidPins(){
        Assert.assertTrue(PinValidator.validate("1234"));
    }

    @Test
    public void testValidPins1(){
        Assert.assertTrue(PinValidator.validate("121317"));
    }

    @Test
    public void testValidPins3(){
        Assert.assertTrue(PinValidator.validate("900876"));
    }

}
