public class LD_21 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     //合并两个链表使用递归方法，一步步判别赋值，最后分别返回对应值
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1==null){
                return list2;
            }
            if(list2==null){
                return list1;
            }

            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }

        }
    }
}
