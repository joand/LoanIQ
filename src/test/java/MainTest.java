import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 18/05/2016.
 */
public class MainTest {

    @Test
    public void getResult() {
        Assert.assertEquals("1", Main.getResult(1));
        Assert.assertEquals("2", Main.getResult(2));
        Assert.assertEquals("FooFoo", Main.getResult(3));
        Assert.assertEquals("4", Main.getResult(4));
        Assert.assertEquals("BarBar", Main.getResult(5));
        Assert.assertEquals("Foo", Main.getResult(6));
        Assert.assertEquals("QixQix", Main.getResult(7));
        Assert.assertEquals("8", Main.getResult(8));
        Assert.assertEquals("Foo", Main.getResult(9));
        Assert.assertEquals("Bar", Main.getResult(10));
    }

    @Test
    public void Test51() {
        //On regarde les diviseurs avant le contenu
        Assert.assertEquals("FooBar", Main.getResult(51));
    }

    @Test
    public void Test53() {
        //On regarde le contenu dans l'ordre où il apparait
        Assert.assertEquals("BarFoo", Main.getResult(53));
    }

    @Test
    public void Test21() {
        //On regarde les multiples dans l'ordre Foo, Bar puis Qix
        Assert.assertEquals("FooQix", Main.getResult(21));
    }

    @Test
    public void Test13() {
        //13 contient, 3 donc s'écrit, “Foo”
        Assert.assertEquals("Foo", Main.getResult(13));
    }

    @Test
    public void Test15() {
        //15 est divisible par 3 et 5 et contient un 5 donc s'écrit “FooBarBar”
        Assert.assertEquals("FooBarBar", Main.getResult(15));
    }

    @Test
    public void Test33() {
        //33 contient deux fois 3 et est divisible par 3 donc s'écrit “FooFooFoo”
        Assert.assertEquals("FooFooFoo", Main.getResult(33));
    }

    @Test
    public void isDivisibleBy() {
        Assert.assertTrue(Main.isDivisibleBy(3, 3));
        Assert.assertTrue(Main.isDivisibleBy(30, 3));
        Assert.assertTrue(Main.isDivisibleBy(6, 3));
        Assert.assertTrue(Main.isDivisibleBy(9, 3));
        Assert.assertTrue(Main.isDivisibleBy(15, 3));

        Assert.assertFalse(Main.isDivisibleBy(13, 3));
        Assert.assertFalse(Main.isDivisibleBy(31, 3));

        Assert.assertTrue(Main.isDivisibleBy(5, 5));
        Assert.assertTrue(Main.isDivisibleBy(15, 5));
        Assert.assertTrue(Main.isDivisibleBy(25, 5));
        Assert.assertTrue(Main.isDivisibleBy(20, 5));
        Assert.assertTrue(Main.isDivisibleBy(50, 5));
        Assert.assertFalse(Main.isDivisibleBy(51, 5));

        Assert.assertTrue(Main.isDivisibleBy(70, 7));
        Assert.assertTrue(Main.isDivisibleBy(7, 7));
        Assert.assertTrue(Main.isDivisibleBy(14, 7));
    }
}


