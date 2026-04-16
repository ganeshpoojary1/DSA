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
    public ListNode deleteMiddle(ListNode head) {
        
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int n=a.size();

        int k=n/2;

        for(int i=0;i<=a.size()-1;i++){
            if(i==k){
                a.remove(i);
            }
        }

        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        for(int i:a){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        return dummy.next;
    }
}