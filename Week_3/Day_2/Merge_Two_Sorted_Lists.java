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
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode temp=new ListNode();
        ListNode l1=temp;
        while(t1!=null&& t2!=null)
        {
            if(t1.val<=t2.val)
            {
                l1.next=t1;
                l1=l1.next;
                t1=t1.next;

            }
            else
            {
                l1.next=t2;
                t2=t2.next;
                l1=l1.next;
            }


        }
        while(t1!=null){
            l1.next=t1;
            l1=l1.next;
            t1=t1.next;}
        while(t2!=null){
            l1.next=t2;
            t2=t2.next;
            l1=l1.next;}
        return temp.next;
    }
}