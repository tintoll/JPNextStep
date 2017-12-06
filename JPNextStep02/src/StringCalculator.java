import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	
	// 
	/* 리팩토링 조건
	 * 1. 메소드가 한가지 책임만 가지도록 구현
	 * 2. 들여쓰기 깊이를 1단계로 유지
	 * 3. else를 사용하지 마라
	 */
	
	public int sum(String inputStr) {
		String[] value = getSplitStr(inputStr);

		int sum = 0;	
		for(int i=0; i < value.length; i++) {
			int val = 0;
			if(value[i].isEmpty()) {
				val = 0;
			}else {
				
				val = Integer.parseInt(value[i]);
				//if(val < 0) throws RuntimeException();
			}
			sum += val;
		}
		
		return sum;
	}

	private String[] getSplitStr(String inputStr) {
		Pattern p = Pattern.compile("//(.)\n(.*)");
		Matcher m = p.matcher(inputStr);
		
		String regEx = ",|:";
		
		if(m.find()) {
			String delimeter = m.group(1);
			regEx += "|"+delimeter;
			inputStr = inputStr.replaceAll(m.group().toString(), "");
		};
		String[] value = inputStr.split(regEx);
		return value;
	}
	
	
	
	
	/**
	 * 요구사항
	 * 1. 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 파싱한다.
	 * 2. 그 안에 숫자가 어떤게 있는지 파악한다.
	 * 3. 숫자인 값들만 합을 하여 반환한다.
	 * 
	 * 4. 커스텀 구분자를 지정할수 있어야한다. '\\'와 '\n' 사이에위치하는 문자를 커스텀 구분자로 사용한다.
	 * 5. 음수를 전달할경우 RuntimeException으로 예외 처리해야한다.
	 * 
	 */
	
	
	
	
}
