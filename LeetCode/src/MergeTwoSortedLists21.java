
public class MergeTwoSortedLists21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null)
			return null;
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		ListNode l1head = l1;
		ListNode l2head = l2;
		ListNode l3head = null;
		ListNode l3 = null;
		while(l1head != null && l2head != null) {
			ListNode temp = null;
			if(l1head.val < l2head.val) {
				temp = new ListNode(l1head.val);
				if(l3head == null) {
					l3head = new ListNode(temp.val);
					l3 = l3head;
					l1head = l1head.next;
				} else {
					l3head.next = temp;
					l3head = l3head.next;
					l1head = l1head.next;
				}
			} else {
				temp = new ListNode(l2head.val);
				if(l3head == null) {
					l3head = new ListNode(temp.val);
					l3 = l3head;
					l2head = l2head.next;
				} else {
					l3head.next = temp;
					l3head = l3head.next;
					l2head = l2head.next;
				}
				
			}
			
		}
		
		if(l1head != null)
			l3head.next = l1head;
		if(l2head != null)
			l3head.next = l2head;
		return l3;
		
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		MergeTwoSortedLists21 m = new MergeTwoSortedLists21();
		ListNode l3 = m.mergeTwoLists(l1, l2);
		while(l3 != null) {
			System.out.print(l3.val + " ");
			l3 = l3.next;
		}
			
		
	}
}
