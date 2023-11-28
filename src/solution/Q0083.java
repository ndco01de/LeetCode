package solution;

import util.ListNode;

public class Q0083 {

	public ListNode deleteDuplicates(ListNode head) {
		
        ListNode ans=new ListNode(-101,head);
        ListNode p=ans;
        ListNode q=ans.next;
        
        while(q!=null){
        	
            if(p.val!=q.val)
                p=p.next=q;
            
            q=q.next;
            
        }
        p.next=q;
        return ans.next;
    }
	
	
	
}
