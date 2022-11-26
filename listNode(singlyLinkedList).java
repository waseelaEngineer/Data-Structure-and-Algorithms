//	Definition for singly-linked list. 
//public class ListNode {
//	int val;
//	ListNode next;
//	ListNode() {}
//	ListNode(int val) { this.val = val; }
//	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

/* 
 * every node contains data and pointer to next node of same data type
 * allows the traversal of data only in one way
 * its size is not fixed
 * not wast of memory its allocated only when it is required
 * contain duplicate
 * maintain insertion order
 * fast in manipulation such as add and remove
 * can be used as a list, stack, queue
 */

public class listNode {

	public static void main(String[] args) {
		ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));    // [1, 2, 3, 4]
		ListNode res = swapPairs(l);    // [2, 1, 4, 3]
	}
	
	// example of listnode 
	static ListNode swapPairs(ListNode head) {
		if ((head == null) || (head.next == null))
			return head;
		ListNode n = head.next;
		head.next = swapPairs(head.next.next);
		n.next = head;
		return n;
	}
}