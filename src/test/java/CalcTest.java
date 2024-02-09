import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		Assertions.assertEquals(10, this.calc.add(6, 4));
	}

	@Test
	void testMinus() {
		Assertions.assertEquals(9, this.calc.minus(13, 4));
	}

	@Test
	void testMultiply() {
		Assertions.assertEquals(48, this.calc.multiply(6, 8));
	}

	@Test
	void testDivide() {
		Assertions.assertEquals(3.4, this.calc.divide(10, 3, 0.1));
	}

}
