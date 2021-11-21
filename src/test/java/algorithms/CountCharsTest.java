package algorithms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CountCharsTest {
    private CountChars victim;

    @BeforeMethod
    public void setUp() {
        victim = new CountChars();
    }

    @Test
    public void testCount_OneCharString() {
        String inputString = "a";
        String expected = "a=1";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_TwoCharString() {
        String inputString = "a b";
        String expected = " =1, a=1, b=1";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_ComplexString() {
        String inputString = "Hoc serie sententiae continet multas litteras. Tu solve forsit. Fortuna amici mei. Consideret commutatio.";
        String expected = " =13, a=6, c=4, C=1, d=1, e=11, f=1, F=1, H=1, i=10, l=3, m=5, n=6, .=4, o=8, r=5, s=7, t=12, T=1, u=4, v=1";

        assertEquals(expected, victim.count(inputString));
    }
}
