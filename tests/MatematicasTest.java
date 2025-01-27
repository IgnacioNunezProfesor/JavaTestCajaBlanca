import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;

//https://www.baeldung.com/parameterized-tests-junit-5
//https://junit.org/junit5/docs/current/user-guide/

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import EED.Matematicas;

class MatematicasTest {

	
	@Test
	@DisplayName("Test Add Method")
	@ParameterizedTest
    @MethodSource("provideAddArguments")
	void testAdd(int a, int b, int expected) {
		assertEquals(expected,Matematicas.add(a, b));
	}
	private static Stream<Arguments> provideAddArguments() {
        return Stream.of(
            Arguments.of(1, 2, 3),
            Arguments.of(3, 3, 6),
            Arguments.of(-1, 1, 0),
            Arguments.of(7, 8, 15)
        );
    }

    private static Stream<Arguments> provideSubtractArguments() {
        return Stream.of(
            Arguments.of(1, 2, -1),
            Arguments.of(0, 0, 0),
            Arguments.of(-1, 1, -2)
        );
    }

	@Test
	@DisplayName("Test subtract Method")
	@ParameterizedTest
    @MethodSource("provideSubtractArguments")
	void testSubtract(int a, int b, int expected) {

		assertEquals(expected,Matematicas.subtract(a, b));		
	}

@Test
@DisplayName("Test subtract Method with Invalid Argument")
void testSubtractThrowsIllegalArgumentException() {
	assertThrows(IllegalArgumentException.class, () -> {
		Matematicas.subtract('a', 8);
	});
}

	@Test
	void testMultiply() {
		assertTrue(true);
	}

	@Test
	void testDivide() {
		assertTrue(true);
	}

	@Test
	void testModulo() {
		assertTrue(true);
	}

	@Test
	void testPower() {
		assertTrue(true);
	}

	@Test
	void testFactorial() {
		assertTrue(true);
	}

	@Test
	void testGcd() {
		assertTrue(true);
	}

	@Test
	void testLcm() {
		assertTrue(true);
	}

	@Test
	void testIsPrime() {
		assertTrue(true);
	}

}
