package algorithms;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UniqueNumberGeneratorTest {

    @Test
    public void testGenerateUniqueNumber() {
        UniqueNumberGenerator victim = new UniqueNumberGenerator();

        assertEquals(1, victim.generateUniqueNumber());
        assertEquals(1, victim.getUniqueNumber());

        assertEquals(2, victim.generateUniqueNumber());
        assertEquals(2, victim.getUniqueNumber());
    }

    @Test
    public void testGenerateUniqueNumber_WithClientId() {
        UniqueNumberGenerator victim = new UniqueNumberGenerator();

        assertEquals(1, victim.generateUniqueNumber(1));
        assertEquals(1, victim.getUniqueNumber(1));
    }

    @Test
    public void testGenerateUniqueNumber_WithClientId_MoreOperations() {
        UniqueNumberGenerator victim = new UniqueNumberGenerator();

        assertEquals(1, victim.generateUniqueNumber(1));
        assertEquals(1, victim.getUniqueNumber(1));

        assertEquals(2, victim.generateUniqueNumber(1));
        assertEquals(2, victim.getUniqueNumber(1));

        assertEquals(1, victim.generateUniqueNumber(2));
        assertEquals(1, victim.getUniqueNumber(2));

        assertEquals(3, victim.generateUniqueNumber(1));
        assertEquals(3, victim.getUniqueNumber(1));
    }
}
