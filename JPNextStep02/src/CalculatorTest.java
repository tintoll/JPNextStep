import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator cal; // JUnit에서는 전역변수에서 인스턴스를 생성하는것을 권장하지 않음.
	
	// @Before 사용한 메서드가 @Test메서드 실행 전에 매번호출된다.
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("setup");
	}
	
	@Test
	public void add() {
		int result = cal.add(3, 4);
		// 첫번째 인자는 기대하는 값, 두번째 인자는 실제 값이 들어간다.
		assertEquals(7, result);
		System.out.println("add");
	}
	
	@Test
	public void sub() throws Exception {
		int result = cal.subtract(5, 4);
		assertEquals(1, result);
		System.out.println("sub");
	}
	
	@Test
	public void mul() throws Exception {
		int result = cal.multiply(5, 4);
		assertEquals(20, result);
		System.out.println("mul");
	}
	
	@Test
	public void div() throws Exception {
		int result = cal.divide(9, 3);
		assertEquals(3, result);
		System.out.println("div");
	}
	
	// @@After 사용한 메서드가 @Test메서드 실행 후에 매번호출된다.
	@After
	public void teardown() {
		System.out.println("teardown");
	}
}
