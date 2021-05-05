package leetcode.com.solutions.romantointeger;

public class Solution {
	private static final int i = 1;
	private static final int v = 5;
	private static final int x = 10;
	private static final int l = 50;
	private static final int c = 100;
	private static final int d = 500;
	private static final int m = 1000;
	
    public static int romanToInt(String s) {
    	int value = 0;
    	int count = 0;
    	for (int index = 0; index < s.length(); index++) {
			switch(s.charAt(index)) {
			case 'I':
    			count = i;
    			if (index + 1 == s.length() || (s.charAt(index + 1) != 'V' && s.charAt(index + 1) != 'X')) {
    				value += count;
    				count = 0;
    			}
    			break;
    		case 'V':
    			value += (v - count);
    			count = 0;
    			break;
    		case 'X':
    			count = (x - count);
    			if (index + 1 == s.length() || (s.charAt(index + 1) != 'L' && s.charAt(index + 1) != 'C')) {
    				value += count;
    				count = 0;
    			}
    			break;
    		case 'L':
    			value += (l - count);
    			count = 0;
    			break;
    		case 'C':
    			count = (c - count);
    			if (index + 1 == s.length() || (s.charAt(index + 1) != 'D' && s.charAt(index + 1) != 'M')) {
    				value += count;
    				count = 0;
    			}
    			break;
    		case 'D':
    			value += (d - count);
    			count = 0;
    			break;
    		case 'M':
    			value += (m - count);
    			count = 0;
    			break;
    		default:
    			System.out.println("Invalid character: " + s.charAt(index));
    			break;
    		}
    	}
    	return value;
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
//    		
//    		
//    		
//    		int currentValue = 0;
//    		
//    		while (i + 1 != s.length() || s.charAt(i + 1) != s.charAt(i)) {
//    			switch(s.charAt(index)) {
//    			case 'I':
//        			count += v;
//        			break;
//        		case 'V':
//        			count += v;
//        			break;
//        		case 'X':
//        			count += x;
//        			break;
//        		case 'L':
//        			count += l;
//        			break;
//        		case 'C':
//        			count += c;
//        			break;
//        		case 'D':
//        			count += d;
//        			break;
//        		case 'M':
//        			count += m;
//        			break;
//        		default:
//        			System.out.println("Invalid character: " + s.charAt(index));
//        			break;
//        		}
//    			index++;
//    		}
//			if (index == s.length()) {
//				value += count;
//				return value;
//			}
//    		
//    		
//    		
//    		
//    		
//    		
//			if (s.charAt(index) == 'I') {
//				while (s.charAt(index) == 'I') {
//	    			count++;
//	    			index++;
//	    			// If end of string reached
//	    			if (index == s.length()) {
//	    				value += count;
//	    				return value;
//	    			}
//	    		}
//			}
//    		switch(s.charAt(index)) {
//    		case 'V':
//    			currentValue = v;
//    			break;
//    		case 'X':
//    			currentValue = x;
//    			break;
//    		case 'L':
//    			currentValue = l;
//    			break;
//    		case 'C':
//    			currentValue = c;
//    			break;
//    		case 'D':
//    			currentValue = d;
//    			break;
//    		case 'M':
//    			currentValue = m;
//    			break;
//    		default:
//    			System.out.println("Invalid character: " + s.charAt(index));
//    			break;
//    		}
//    		
//    		if (s.charAt(index) == 'X' || s.charAt(index) == 'V') {
//    			// if count has a value, then subtract it from the amount
//    			if (count > 0) {
//    				currentValue -= count;
//    			// else get a count of I's after this char
//    			} else {
//    				index++;
//    				while (index < s.length() && s.charAt(index) == 'I') {
//            			count++;
//            			index++;
//            		}
//    				currentValue += count;
//    			}
//    			count = 0;
//    		}
//    		value += currentValue;
//    	}
        
    }

}
