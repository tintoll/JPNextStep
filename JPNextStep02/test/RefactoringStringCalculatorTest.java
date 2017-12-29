import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class RefactoringStringCalculatorTest {
	
	RefactoringStringCalculator cal;
	
	@Before
	public void setup() {
		cal = new RefactoringStringCalculator();
	}
	@Test
	public void add_널_또는빈문자열() {
		assertEquals(0, cal.add(null));
		assertEquals(0, cal.add(""));
	}
	@Test
	public void add_숫자하나() {
		assertEquals(1, cal.add("1"));
	}
	@Test
	public void add_쉼표구분자() {
		assertEquals(3, cal.add("1,2"));		
		assertEquals(6, cal.add("1,2,3"));		
	}
	@Test
	public void add_쉼표_또는_콜론_구분자() {
		assertEquals(6, cal.add("1,2:3"));			
	}
	@Test
	public void add_custrom_구분자() {
		assertEquals(6, cal.add("//;\n1;2;3"));					
	}
	
	@Test(expected = RuntimeException.class)
	public void add_Exception() throws Exception {
		cal.add("1,-2,3");
	}
	
	
	
}
