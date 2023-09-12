import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() throws Rational.Illegal {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(7, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubstract() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(3, 4);
//        Rational y = new Rational(3, 4);
        x.multiply(y);
        // Assert both numerator and denominator
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(6, x.denominator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(3, 4);
//        Rational y = new Rational(3, 4);
        x.multiply(y);
        // Assert both numerator and denominator
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(6, x.denominator);
    }
}

