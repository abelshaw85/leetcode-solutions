package leetcode.com.solutions.romantointeger;

public class Demo {

	public static void main(String[] args) {
		printInputOutput("III");
		printInputOutput("IV");
		printInputOutput("IX");
		printInputOutput("LVIII");
		printInputOutput("MCMXCIV");
//				Output: 3
//				Example 2:
//
//				Input: s = "IV"
//				Output: 4
//				Example 3:
//
//				Input: s = "IX"
//				Output: 9
//				Example 4:
//
//				Input: s = "LVIII"
//				Output: 58
//				Explanation: L = 50, V= 5, III = 3.
//				Example 5:
//
//				Input: s = "MCMXCIV"
		
	}
	
	public static void printInputOutput(String input) {
		System.out.println("Input: " + input + ", Output: " + Solution.romanToInt(input));
	}

}
