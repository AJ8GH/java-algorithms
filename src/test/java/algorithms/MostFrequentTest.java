package algorithms;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MostFrequentTest {
  private MostFrequent victim;

  @BeforeEach
  void setUp() {
    victim = new MostFrequent();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void testMostFrequent(String name, Set<String> expected, List<String> words) {
    assertEquals(expected, victim.findMostFrequent(words));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            "Singleton list",
            Set.of("the"),
            singletonList("the")
        ),
        Arguments.of(
            "One winner, word appears twice",
            Set.of("fox"),
            List.of("The", "swift", "fox", "fox")
        ),
        Arguments.of(
            "One winner, word appears three times",
            Set.of("jumped"),
            List.of("The", "swift", "fox", "fox", "jumped", "jumped", "jumped")
        ),
        Arguments.of(
            "2 word tie, words appear twice",
            Set.of("swift", "fox"),
            List.of("The", "swift", "swift", "fox", "fox", "jumped")
        ),
        Arguments.of(
            "3 word tie, words appear three times",
            Set.of("a", "b", "c"),
            List.of("a", "a", "a", "b", "b", "b", "c", "c", "c")
        ),
        Arguments.of(
            "All words appear once",
            Set.of("the", "swift", "fox", "jumped", "over"),
            List.of("The", "swift", "fox", "jumped", "over")
        ),
        Arguments.of(
            "Mixed cases",
            Set.of("fox"),
            List.of("The", "the", "fox", "FOX", "fOX")
        ),
        Arguments.of(
            "Mixed cases",
            Set.of("fox"),
            List.of("The", "the", "fox", "FOX", "fOX")
        ),
        Arguments.of(
            "Punctuation",
            Set.of("fox"),
            List.of("The", "the", "fox...", "FOX!", "fOX:")
        ),
        Arguments.of(
            "Hyphens and apostrophes",
            Set.of("can't", "long-term"),
            List.of("can't", "long-term", "won't", "long-term", "can't", "high-tech")
        )
    );
  }
}
