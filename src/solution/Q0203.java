package solution;

import util.ListNode;

public class Q0203 {

	public ListNode removeElements(ListNode head, int val) {
		
        ListNode ans=new ListNode(0,head);
        ListNode p=ans;
        ListNode q=ans.next;
        
        while(q!=null){
        	
            if(val!=q.val)
                p=p.next=q;
            
            q=q.next;
            
        }
        p.next=q;
        return ans.next;
    }
	
	
	
}
