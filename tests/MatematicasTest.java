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


	@Test
	void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	void testModulo() {
		fail("Not yet implemented");
	}

	@Test
	void testPower() {
		fail("Not yet implemented");
	}

	@Test
	void testFactorial() {
		fail("Not yet implemented");
	}

	@Test
	void testGcd() {
		fail("Not yet implemented");
	}

	@Test
	void testLcm() {
		fail("Not yet implemented");
	}

	@Test
	void testIsPrime() {
		fail("Not yet implemented");
	}

}
