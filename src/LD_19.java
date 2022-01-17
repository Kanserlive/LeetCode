public class LD_19 {
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
    //双指针，让快指针先走n步，如果为空，则要删除链表第一个节点
    //然后快慢指针向后移，快指针遍历完，慢指针位于待删除的前一个节点，进行删除return head
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow=head,fast=head;
            while(n--!=0){
                fast=fast.next;
            }
            if(fast==null){
                return head.next;
            }
            fast=fast.next;
            while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;

        }
    }

    private class ListNode {
        public ListNode next;
    }
}
