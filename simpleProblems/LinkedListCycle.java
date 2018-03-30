package simpleProblems;
/*
 * Given a linked list, determine if it has a cycle in it without using extra space.
 */

public class LinkedListCycle {
	
	static ListNode head;
	public class ListNode {
		int val;
		ListNode next;
		ListNode (int x) {
			val = x;
			next = null;
		}
	}
	
	public void push(int newdata) {
		ListNode newnode = new ListNode(newdata);
		newnode.next = head;
		head = newnode;
	}
	// function has two pointers slow and fast. Slow pointer will take one step and 
	// fast pointer will take 2 steps at a time. Linked List has a cycle if the slow and 
	// fast pointers meet at a point.
	public boolean detectCycle(ListNode head) {
		if(head == null || head.next == null) {
			return false;
		}
		ListNode slow_ptr = head;
		ListNode fast_ptr = head;
		
		while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			
			if(slow_ptr == fast_ptr) {
				System.out.println("Loop Detected");
				return true;
			}
		}
		System.out.println("No Loop is detected");
		return false;
	}
	

	public static void main(String[] args) {
		LinkedListCycle list = new LinkedListCycle();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.head.next.next.next = list.head;
		list.detectCycle(head);
	}
}
