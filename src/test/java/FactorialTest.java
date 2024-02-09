import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	private Factorial fact = new Factorial();

	@Test
	void factorial() {
		Assertions.assertEquals(5040, this.fact.factorial(7));
	}

	@Test
	void revFactorial120() {
		Assertions.assertEquals("5!", this.fact.revFactorial(120));
	}

	@Test
	void revFactorial150() {
		Assertions.assertEquals("none", this.fact.revFactorial(150));
	}

	@Test
	void revFactorial3628800() {
		Assertions.assertEquals("10!", this.fact.revFactorial(3628800));
	}

}
