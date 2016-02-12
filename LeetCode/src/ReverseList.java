
public class ReverseList {
	
	 public ListNode reverseList(ListNode head) {
		 	if(head == null)
		 		return null;
		 	ListNode list = new ListNode(head.val);
		 	head = head.next;
		 	while(head != null) {
		 		ListNode current = new ListNode(head.val);
		 		current.next = list;
		 		list = current;
		 		head = head.next;
		 	}
	        return list;
	 }
	 
	 public static void main(String[] args) {
		 ListNode one = new ListNode(1);
			ListNode two = new ListNode(2);
			ListNode three = new ListNode(3);
			ListNode four = new ListNode(4);
			
			one.next = two;
			two.next = three;
			three.next = four;
			
			
			ReverseList rl = new ReverseList();
			ListNode list = rl.reverseList(one);
			
			while(list != null) {
				System.out.println(list.val);
				list = list.next;
			}
	}

}
