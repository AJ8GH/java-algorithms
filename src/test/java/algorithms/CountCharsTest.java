package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountCharsTest {
  private CountChars victim;

  @BeforeEach
  void setUp() {
    victim = new CountChars();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void testCount(String name, String expected, String input) {
    assertEquals(expected, victim.count(input));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("Single character string", "a=1", "a"),
        Arguments.of("Three character string with a space", " =1, a=1, b=1", "a b"),
        Arguments.of(
            "Complex String",
            " =13, a=6, c=4, C=1, d=1, e=11, f=1, F=1, H=1, i=10, l=3, m=5, n=6, .=4, o=8, r=5, s=7, t=12, T=1, u=4, v=1",
            "Hoc serie sententiae continet multas litteras. Tu solve forsit. Fortuna amici mei. Consideret commutatio."
        )
    );
  }
}
