public class LD_116 {

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

//第一个while判断下一行左边出现null终止
//第二个while判断每一行最右边出现null终止
//第一个if，同一个父类下的left--next--right
//第二个if，不同但相邻父类下的 左父.right--next--右父.left
    class Solution {
        public Node connect(Node root) {
            if(root==null){
                return root;
            }
            Node pre=root;
            while(pre.left!=null){
                Node temp=pre;
                while(temp!=null){
                    temp.left.next=temp.right;
                    if(temp.next!=null){
                        temp.right.next=temp.next.left;
                    }
                    temp=temp.next;
                }
                pre=pre.left;
            }
            return root;
        }
    }
}
