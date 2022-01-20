public class LD_206 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     //迭代法
    //temp寄存cur的下一个值
    //cur.next=pre就是链表反向，但反向后原先链表的next找不到，所以先用temp寄存
    //然后pre向后移，cur向后移,继续使下一个反向。
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode cur=head;
            ListNode prev=null;
            ListNode temp=null;
            while(cur!=null){
                temp=cur.next;
                cur.next=prev;
                prev=cur;
                cur=temp;
            }
            return prev;

        }
    }

    //递归法
    class Solution1 {
        public ListNode reverseList(ListNode head) {
            return reverse(head,null);

        }

        public ListNode reverse(ListNode cur,ListNode prev){
            if(cur==null){
                return prev;
            }
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
            return reverse(cur,prev);

        }
    }
}
