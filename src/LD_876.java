public class LD_876 {
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
    //使用快慢指针方法，
    //快指针一次走2步 慢指针一次走1步
    //当快指针走到终点是，慢指针走到链表中间。
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow=head,quick=head;
            while(quick!=null&&quick.next!=null){
                slow=slow.next;
                quick=quick.next.next;
            }
            return slow;

        }
    }

    private class ListNode {
        public ListNode next;
    }
}
