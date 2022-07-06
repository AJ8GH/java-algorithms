package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UniqueNumberGeneratorTest {
  private UniqueNumberGenerator victim;

  @BeforeEach
  void setUp() {
    victim = new UniqueNumberGenerator();
  }

  @Test
  void testGenerateUniqueNumber() {
    assertEquals(1, victim.generateUniqueNumber());
    assertEquals(1, victim.getUniqueNumber());

    assertEquals(2, victim.generateUniqueNumber());
    assertEquals(2, victim.getUniqueNumber());
  }

  @Test
  void testGenerateUniqueNumber_WithClientId() {
    assertEquals(1, victim.generateUniqueNumber(1));
    assertEquals(1, victim.getUniqueNumber(1));
  }

  @Test
  void testGenerateUniqueNumber_WithClientId_MoreOperations() {
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
