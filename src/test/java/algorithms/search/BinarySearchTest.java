package algorithms.search;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
  private BinarySearch<Integer> binarySearch;

  @BeforeEach
  void setUp() {
    binarySearch = new BinarySearch<>();
  }

  @Test
  void find_OneElementList() {
    List<Integer> list = singletonList(9);

    assertEquals(0, binarySearch.search(list, 9));
    assertEquals(-1, binarySearch.search(list, 2));
  }

  @Test
  void find_TwoElementList() {
    List<Integer> list = List.of(2, 9);

    assertEquals(0, binarySearch.search(list, 2));
    assertEquals(1, binarySearch.search(list, 9));
    assertEquals(-1, binarySearch.search(list, 5));
  }

  @Test
  void find_ThreeElementList() {
    List<Integer> list = List.of(2, 6, 9);

    assertEquals(0, binarySearch.search(list, 2));
    assertEquals(1, binarySearch.search(list, 6));
    assertEquals(2, binarySearch.search(list, 9));
    assertEquals(-1, binarySearch.search(list, 7));
  }

  @Test
  void find_FourElementList() {
    List<Integer> list = List.of(2, 6, 7, 9);

    assertEquals(0, binarySearch.search(list, 2));
    assertEquals(1, binarySearch.search(list, 6));
    assertEquals(2, binarySearch.search(list, 7));
    assertEquals(3, binarySearch.search(list, 9));
    assertEquals(-1, binarySearch.search(list, 1));
  }

  @Test
  void find_ElevenElementList() {
    List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20);

    assertEquals(0, binarySearch.search(list, 2));
    assertEquals(1, binarySearch.search(list, 3));
    assertEquals(2, binarySearch.search(list, 5));
    assertEquals(3, binarySearch.search(list, 6));
    assertEquals(4, binarySearch.search(list, 7));
    assertEquals(5, binarySearch.search(list, 9));
    assertEquals(6, binarySearch.search(list, 10));
    assertEquals(7, binarySearch.search(list, 13));
    assertEquals(8, binarySearch.search(list, 14));
    assertEquals(9, binarySearch.search(list, 17));
    assertEquals(10, binarySearch.search(list, 20));
    assertEquals(-1, binarySearch.search(list, 11));
  }

  @Test
  void find_TwentyFiveElementList() {
    List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20,
        21, 22, 24, 26, 28, 31, 35, 40, 60, 62, 63, 67, 70, 90);

    assertEquals(1, binarySearch.search(list, 3));
    assertEquals(2, binarySearch.search(list, 5));
    assertEquals(4, binarySearch.search(list, 7));
    assertEquals(7, binarySearch.search(list, 13));
    assertEquals(8, binarySearch.search(list, 14));
    assertEquals(11, binarySearch.search(list, 21));
    assertEquals(14, binarySearch.search(list, 26));
    assertEquals(16, binarySearch.search(list, 31));
    assertEquals(17, binarySearch.search(list, 35));
    assertEquals(19, binarySearch.search(list, 60));
    assertEquals(22, binarySearch.search(list, 67));
    assertEquals(23, binarySearch.search(list, 70));
    assertEquals(-1, binarySearch.search(list, 33));
  }

  @Test
  void find_VeryLongList() {
    List<Integer> list = IntStream.range(0, 100_000_000)
        .boxed()
        .toList();

    int actual = 70_876_342;
    var target = list.get(actual);
    assertEquals(actual, binarySearch.search(list, target));

    actual = 20_321_792;
    target = list.get(actual);
    assertEquals(actual, binarySearch.search(list, target));

    actual = 30_452;
    target = list.get(actual);
    assertEquals(actual, binarySearch.search(list, target));

    actual = 452;
    target = list.get(actual);
    assertEquals(actual, binarySearch.search(list, target));

    actual = 99_914_872;
    target = list.get(actual);
    assertEquals(actual, binarySearch.search(list, target));

    actual = 90_914_872;
    target = list.get(actual);
    assertEquals(actual, binarySearch.search(list, target));

    assertEquals(-1, binarySearch.search(list, -1));
    assertEquals(-1, binarySearch.search(list, 100_000_001));
  }
}
