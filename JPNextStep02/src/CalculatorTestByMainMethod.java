
public class CalculatorTestByMainMethod {
	
	
	// main() 메소드 하나에 프로덕션 코드의 여러 메소드를 동시에 테스트 하고 있다. 
	// 이러면 Calculator클래스의 복잡도가 증가할수록 main() 메소드가 복잡해진다. 
	
	// 2. 프로덕션 메서드별로 테스트하는 메서드를 만들어 주자 
	
	// 메서드별로 테스트메서드를 만들어주지만 테스트 결과를 매번 콘솔을 통해서 확인해야되는 불편한 점이 있다.
	// 그래서 사용하는 것이 JUnit이다. 
	// JUnit은 내가 관심을 가지는 메소드에 대한 테스트만 가능하다.
	// 또한, 로직을 실행한 후의 결과 값 확인을 프로그래밍을 통해 자동화하는 것이 가능하다.
	public static void main(String[] args) {
		Calculator cal = new Calculator();	
		add(cal);
		substract(cal);
		multiply(cal);
		divide(cal);
	}
	public static void add(Calculator cal) {
		System.out.println(cal.add(9, 3));		
	}
	public static void substract(Calculator cal) {
		System.out.println(cal.subtract(9, 3));
	}
	public static void multiply(Calculator cal) {
		System.out.println(cal.multiply(9, 3));
	}
	public static void divide(Calculator cal) {
		System.out.println(cal.divide(9, 3));
	}
	
}
