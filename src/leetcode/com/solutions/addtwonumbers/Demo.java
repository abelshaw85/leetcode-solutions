package leetcode.com.solutions.addtwonumbers;

public class Demo {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		System.out.println("Example input: ");
		printNode(l1);
		printNode(l2);
		System.out.println("Output: ");
		ListNode result = Solution.addTwoNumbers(l1, l2);
		printNode(result);
		
		l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		System.out.println("");
		System.out.println("Example input: ");
		printNode(l1);
		printNode(l2);
		System.out.println("Output: ");
		result = Solution.addTwoNumbers(l1, l2);
		printNode(result);
	}
	
	private static void printNode(ListNode node) {
		StringBuilder sb = new StringBuilder();
				
		sb.append("[");
		while (node != null) {
			sb.append(node.val);
			if (node.next != null) {
				sb.append(", ");
			}
			node = node.next;
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
