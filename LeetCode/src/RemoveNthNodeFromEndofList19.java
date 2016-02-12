
public class RemoveNthNodeFromEndofList19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(n < 0)
			return null;
		int len = 1;
		ListNode head1 = head;
		ListNode needDeleteNode = head;
		ListNode needDeleteNodePrev = null;
		while(head1 != null) {
			if(len > n) {
				needDeleteNodePrev = needDeleteNode;
				needDeleteNode = needDeleteNode.next;
			}
			head1 = head1.next;
			len++;
		}
		if(needDeleteNodePrev == null)
			head = head.next;
		else
			needDeleteNodePrev.next = needDeleteNodePrev.next.next;
		return head;
    }
	
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
//		ListNode two = new ListNode(2);
//		ListNode three = new ListNode(3);
//		ListNode four = new ListNode(4);
//		ListNode five = new ListNode(5);
//		
//		one.next = two;
//		two.next = three;
//		three.next = four;
//		four.next = five;
		
		ListNode head = new RemoveNthNodeFromEndofList19().removeNthFromEnd(one, 1);
		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
