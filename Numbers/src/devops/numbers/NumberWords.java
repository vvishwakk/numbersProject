package devops.numbers;

import java.util.Arrays;
import java.util.List;

public class NumberWords {
	
	private static List<String> list = Arrays.asList("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
	
	private static List<String> tensMultiple = Arrays.asList("", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety");
	
	private static List<String> tensPower = Arrays.asList("hundred", "thousand");
	
	public String toWords(int number) {
		return toWords(number, "");
	}

	public String toWords(int number, String result) {
		String finalResult = result;

		if(number < 0 || number > 999) {
			finalResult = "Number out of range";
		} else {
			if(number == 0) {
				finalResult = list.get(number);
			} if(number > 0 && number <= 19) {
				finalResult = list.get(number);
			} if(number > 19 && number <= 99) {
				finalResult = tensMultiple.get(number / 10);
				finalResult = finalResult + " " + toWords(number % 10, finalResult);
			} if(number >= 100 && number <= 999) {
				finalResult = list.get(number / 100) + " " + tensPower.get(0);
				finalResult = finalResult + " " + toWords(number % 100, finalResult);
			} 
		}
		return finalResult.trim() ;
	}

}
