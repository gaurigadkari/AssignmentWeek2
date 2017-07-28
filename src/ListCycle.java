
public class ListCycle {
	public ListNode detectCycle(ListNode a) {
	    ListNode slow = a, fast = a;
	    boolean cycle = false;
	    while(fast.next != null) {
	        slow = slow.next;
	       // System.out.println(fast.val);
	        fast = fast.next.next;
	        if(fast == null) {
	            break;
	        }
	        if(slow == fast) {
	            slow = a;
	            cycle = true;
	            break;
	            
	        }
	    }
	    if(cycle) {
    	    while(fast.next != null) {
    	        if(slow == fast) {
    	            return slow;
    	        }
    	        slow = slow.next;
    	        fast = fast.next;
    	    }
	        
	    }
	    return null;
	}
}