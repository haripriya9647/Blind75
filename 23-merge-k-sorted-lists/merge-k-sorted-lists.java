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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists,0,lists.length-1);
    }

    public ListNode merge(ListNode[] lists,int left,int right){
        if (left == right) 
          return lists[left];

        int mid = left + (right-left)/2;
        ListNode leftlist = merge(lists,left,mid);
        ListNode rightlist = merge(lists,mid+1,right);

        return mergelists(leftlist,rightlist);
    }

    public ListNode mergelists(ListNode l1,ListNode l2){
        if(l1==null)
          return l2;

        if(l2==null)
          return l1;

        if(l1.val<l2.val){
         l1.next = mergelists(l1.next,l2);
         return l1;
        }
        else{
         l2.next = mergelists(l1,l2.next);
          return l2;
        }
    }
}