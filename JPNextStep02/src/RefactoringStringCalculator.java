import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RefactoringStringCalculator {

	public int add(String text) {	
		if(isBlank(text)) {
			return 0;
		}
		return sum(toInts(split(text)));	
	}

	private String[] split(String text) {
		Pattern p = Pattern.compile("//(.)\n(.*)");
		Matcher m = p.matcher(text);
		if(m.find()) {
			String delimeter = m.group(1); // 첫번째 인자 구분(.)		
			return m.group(2).split(delimeter); // (.*)
		}
		return text.split(",|:");
	}

	private boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	private int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for (int i=0; i < numbers.length; i++) {
			int number = toPositive(values, i);
			numbers[i] = number;
		}
		return numbers;
	}

	private int toPositive(String[] values, int i) {
		int number = Integer.parseInt(values[i]);
		if(number < 0) {
			throw new RuntimeException();
		}
		return number;
	}
	private int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
