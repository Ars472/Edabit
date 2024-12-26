package triagleTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import triagle.TriangleNumber;

public class TriangleNumberTest {
    @Test
    public void testTriangle(){
        Assert.assertEquals(TriangleNumber.triangle(1),1);
        Assert.assertEquals(TriangleNumber.triangle(6),21);
        Assert.assertEquals(TriangleNumber.triangle(215),23220);
        Assert.assertEquals(TriangleNumber.triangle(3),6);
        Assert.assertEquals(TriangleNumber.triangle(10),55);
        Assert.assertEquals(TriangleNumber.triangle(100),5050);
    }
}
