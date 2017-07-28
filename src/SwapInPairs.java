
public class SwapInPairs {
	public ListNode swapPairs(ListNode a) {
	    ListNode swap = a;
	    int temp;
	    while(swap != null && swap.next != null) {
	        temp = swap.val;
	        swap.val = swap.next.val;
	        swap.next.val = temp;
	        swap = swap.next.next;
	    }
	    return a;
	}
}