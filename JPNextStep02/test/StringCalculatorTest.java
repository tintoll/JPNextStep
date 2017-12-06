import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		String inputStr = "1,2;3//;\n";
//		String inputStr = "1,2:3";
		
		StringCalculator cal = new StringCalculator();
		assertEquals(6, cal.sum(inputStr) );
	}

}
