package algorithms;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
  private BinarySearch<Integer> victim;

  @BeforeEach
  void setUp() {
    victim = new BinarySearch<>();
  }

  @Test
  void testFind_OneElementList() {
    List<Integer> list = singletonList(9);

    assertEquals(0, victim.search(list, 9));
    assertEquals(-1, victim.search(list, 2));
  }

  @Test
  void testFind_TwoElementList() {
    List<Integer> list = List.of(2, 9);

    assertEquals(0, victim.search(list, 2));
    assertEquals(1, victim.search(list, 9));
    assertEquals(-1, victim.search(list, 5));
  }

  @Test
  void testFind_ThreeElementList() {
    List<Integer> list = List.of(2, 6, 9);

    assertEquals(0, victim.search(list, 2));
    assertEquals(1, victim.search(list, 6));
    assertEquals(2, victim.search(list, 9));
    assertEquals(-1, victim.search(list, 7));
  }

  @Test
  void testFind_FourElementList() {
    List<Integer> list = List.of(2, 6, 7, 9);

    assertEquals(0, victim.search(list, 2));
    assertEquals(1, victim.search(list, 6));
    assertEquals(2, victim.search(list, 7));
    assertEquals(3, victim.search(list, 9));
    assertEquals(-1, victim.search(list, 1));
  }

  @Test
  void testFind_ElevenElementList() {
    List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20);

    assertEquals(0, victim.search(list, 2));
    assertEquals(1, victim.search(list, 3));
    assertEquals(2, victim.search(list, 5));
    assertEquals(3, victim.search(list, 6));
    assertEquals(4, victim.search(list, 7));
    assertEquals(5, victim.search(list, 9));
    assertEquals(6, victim.search(list, 10));
    assertEquals(7, victim.search(list, 13));
    assertEquals(8, victim.search(list, 14));
    assertEquals(9, victim.search(list, 17));
    assertEquals(10, victim.search(list, 20));
    assertEquals(-1, victim.search(list, 11));
  }

  @Test
  void testFind_TwentyFiveElementList() {
    List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20,
        21, 22, 24, 26, 28, 31, 35, 40, 60, 62, 63, 67, 70, 90);

    assertEquals(1, victim.search(list, 3));
    assertEquals(2, victim.search(list, 5));
    assertEquals(4, victim.search(list, 7));
    assertEquals(7, victim.search(list, 13));
    assertEquals(8, victim.search(list, 14));
    assertEquals(11, victim.search(list, 21));
    assertEquals(14, victim.search(list, 26));
    assertEquals(16, victim.search(list, 31));
    assertEquals(17, victim.search(list, 35));
    assertEquals(19, victim.search(list, 60));
    assertEquals(22, victim.search(list, 67));
    assertEquals(23, victim.search(list, 70));
    assertEquals(-1, victim.search(list, 33));
  }
}
