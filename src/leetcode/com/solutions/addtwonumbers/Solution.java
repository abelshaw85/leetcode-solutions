package leetcode.com.solutions.addtwonumbers;
/* https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 * */
public class Solution {
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode currentNode = root;
        
        while (true) {
        	int currentValue = currentNode.val;
        	int l1Val = l1 == null ? 0 : l1.val;
        	int l2Val = l2 == null ? 0 : l2.val;
            int value = currentValue + l1Val + l2Val;
            int overflow = 0;
            if (value > 9) {
            	int temp = value;
            	value = temp - 10;
            	overflow = temp / 10;
            }
            currentNode.val = value;
            if ((l1 == null || l1.next == null) && (l2 == null || l2.next == null) && overflow == 0) {
            	break;
            }
            
            currentNode.next = new ListNode(overflow);
            currentNode = currentNode.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return root;
    }

}
