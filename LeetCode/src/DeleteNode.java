
public class DeleteNode {
     
	 public void deleteNode(ListNode node) {
	        
		 if(node == null)
			 return ;
		 while(node.next != null) {
			 if(node.next.val == 3) {
				 node.next = node.next.next;
				 
			 }
			 node = node.next; 
		 }
		 
		 
	 }
	 
	 public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		
		one.next = two;
		two.next = three;
		three.next = four;
		
		
		
		DeleteNode dn = new DeleteNode();
		dn.deleteNode(one);
		
		while(one != null) {
			System.out.println(one.val);
			one = one.next;
		}
		
	 }
}
