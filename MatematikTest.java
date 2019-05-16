
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


@RunWith(JUnit4.class)
public class MatematikTest {

    @Rule
    public Timeout globalTimeout = new Timeout(3000); // MAX 3 SEKUNDER PER TESTAD METOD

    com.hmkcode.junit.Math math = new com.hmkcode.junit.Math();

    @Test

    public void testAssertNotNull() {
        org.junit.Assert.assertNotNull("SKA INTE VARA NULL", math);
    }



    @Test ///Testar om 5 + 10 = 15
    public void test1Sum() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.sum(5, 10) == 15);

    }

    @Test //5 + 10 = 0 äro falskt
    public void test2Sum() {
        org.junit.Assert.assertFalse("FAILURE - NOT EQUAL!", math.sum(5, 10) == 0);

    }

    @Test //Testar man kan plussa negativa tal
    public void test3Sum() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.sum(-3, -2) == -5);

    }

    @Test //Testar multiplicera och sen addera i samma metod
    public void test4Sum() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.sum(5*2, 5) == 15);

    }



    @Test //Testar att felmeddelandet fungerar
    public void test1Multiply() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.multiply(3, 2) == 6);
    }

    @Test //Testar om 5 * 2 = 10
    public void test2Multiply() {
        org.junit.Assert.assertEquals(true, math.multiply(5, 2) == 10);
    }

    @Test //Testar man kan multplicera negativa tal
    public void test3Multiply() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.multiply(-3, -2) == 6);
    }

    @Test //Testar om metoden returnerar double
    public void test4Multiply() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.multiply(3.0, 2.0) == 6.0);
    }



    @Test //Testar om 3 / 2 = 1.5
    public void test1Divide() {
        double x = 3, y = 2;
        assertThat("FAILURE - KAN INTE DIVIDERA MED 0!", y, is(not(0.0)));
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.divide(x, y) == 1.5);
    }

    @Test //Testar om felmeddelande fungerar med hjälp av att dela 5 med 0
    public void test2Divide() {
        double x = 5, y = 0;
        assertThat("FAILURE - KAN INTE DIVIDERA MED 0!", y, is((0.0)));
        org.junit.Assert.assertFalse("FAILURE - NOT EQUAL!", math.divide(x, y) == 0);
    }

    @Test //Testar om man kan dividera med negativa tal
    public void test3Divide() {
        double x = -6, y = -2;
        assertThat("FAILURE - KAN INTE DIVIDERA MED 0!", y, is(not(0.0)));
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.divide(x, y) == 3);
    }

    @Test //Testar om summa kan bli negativa tal
    public void test4Divide() {
        double x = 700, y = -1000;
        assertThat("FAILURE - KAN INTE DIVIDERA MED 0!", y, is(not(0.0)));
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.divide(x, y) == -0.7);
    }



    @Test //Testar en simpel subtraktionsuppgift: 3 - 2 = 1
    public void test1Subtract() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.subtract(3, 2) == 1);
    }


    @Test //Testar om failmessage fungerar med hjälp av felaktig summa
    public void test2Subtract() {
        org.junit.Assert.assertFalse("FAILURE - NOT EQUAL!", math.subtract(5, 2) == 1);
    }

    @Test //Testar om man subtrahera med minusvärden
    public void test3Subtract() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.subtract(-1, -2) == 1);
    }

    @Test //Testar om summan kan bli minus
    public void test4Subtract() {
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.subtract(5000, 7000) == -2000);
    }
}
