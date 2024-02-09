package testing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {

	private Doggo doggo = new Doggo();

	@Test
	void doggo1st() {
		Assertions.assertEquals("1st", this.doggo.place(1));
	}

	@Test
	void doggo2nd() {
		Assertions.assertEquals("2nd", this.doggo.place(2));
	}

	@Test
	void doggo3rd() {
		Assertions.assertEquals("3rd", this.doggo.place(3));
	}

	@Test
	void doggo11th() {
		Assertions.assertEquals("11th", this.doggo.place(11));
	}

	@Test
	void doggo12th() {
		Assertions.assertEquals("12th", this.doggo.place(12));
	}

	@Test
	void doggo13th() {
		Assertions.assertEquals("13th", this.doggo.place(13));
	}

	@Test
	void doggo42nd() {
		Assertions.assertEquals("42nd", this.doggo.place(42));
	}

}