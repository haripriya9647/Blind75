/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode res = new ListNode(-1);
        ListNode curr = res;
        
        if(c1==null)
          return c2;
        if(c2==null)
          return c1;
        if(c1==null && c2==null)
          return null;

        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                curr.next = c1;
                c1=c1.next;
            }
            else{
                curr.next = c2;
                c2=c2.next;
            }
            curr=curr.next;
        }
        if(c1!=null)
          curr.next=c1;
        else
          curr.next=c2;

        return res.next;
    }
}