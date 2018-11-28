import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testWhenPassedNumberReturnNumber() {
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals(fizzBuzz.fizzBuzz(1),"1");
	}

}

