
public class Calculator {
	
	int add(int a, int b) {
		return a + b;
	}
	int subtract(int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a * b;
	}
	int divide(int a, int b) {
		return a / b;
	}
	
	// main() 메소드는 프로그래밍을 실행하기 위한 목적과
	// 프로덕션 코드가 정상적으로 동작하는지 확인 하는 테스트의 목적으로 나눈다. 
	
	// 1. main() 메소드와 프로덕션 코드를 분리하자 
	/* 아래의 내용이 CaculatorTest.java로 이동한다. 
	public static void main(String[] args) {
		Calculator cal = new Calculator();		
		System.out.println(cal.add(9, 3));
		System.out.println(cal.subtract(9, 3));
		System.out.println(cal.multiply(9, 3));
		System.out.println(cal.subtract(9, 3));
	}
	*/
}
