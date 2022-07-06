package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountWordsTest {
  private CountWords victim;

  @BeforeEach
  void setup() {
    victim = new CountWords();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void testCount(String name, String expected, String sentence) {
    assertEquals(expected, victim.count(sentence));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("One word string", "{the=1}", "the"),
        Arguments.of("Two unique word string", "{the=1, swift=1}", "the swift"),
        Arguments.of("Two word string with duplicates", "{hello=1, bye=2}", "hello bye bye"),
        Arguments.of("Sentence with punctuation", "{hello=1, bye=2}", "hello bye bye,"),
        Arguments.of("Words with apostrophes", "{don't=2, can't=1}", "don't, can't, don't"),
        Arguments.of(
            "Hyphenated words",
            "{high-tech=1, long-term=2}",
            "long-term, long-term, high-tech"
        ),
        Arguments.of(
            "Words with mixed cases",
            "{meet=1, hello=2, to=1, nice=1, you=1, bye=3}",
            "Hello hello! Nice to meet you. BYE Bye bye..."
        )
    );
  }
}
