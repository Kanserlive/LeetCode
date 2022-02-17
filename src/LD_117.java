import java.util.LinkedList;
import java.util.Queue;

public class LD_117 {

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

//改良方法
    class Solution {
        public Node connect(Node root) {
            if(root==null){
                return root;
            }
            Node cur=root;
            while(cur!=null){
                Node dummy=new Node(0);
                Node pre=dummy;
                while(cur!=null){
                    if(cur.left!=null){
                        pre.next=cur.left;
                        pre=pre.next;
                    }
                    if(cur.right!=null){
                        pre.next=cur.right;
                        pre=pre.next;
                    }
                    cur=cur.next;
                }
                cur=dummy.next;
            }
            return root;
        }
    }

    class Solution2 {
        public Node connect(Node root) {
            if (root == null)
                return root;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                //每一层的数量
                int levelCount = queue.size();
                //前一个节点
                Node pre = null;
                for (int i = 0; i < levelCount; i++) {
                    //出队
                    Node node = queue.poll();
                    //如果pre为空就表示node节点是这一行的第一个，
                    //没有前一个节点指向他，否则就让前一个节点指向他
                    if (pre != null) {
                        pre.next = node;
                    }
                    //然后再让当前节点成为前一个节点
                    pre = node;
                    //左右子节点如果不为空就入队
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
            }
            return root;
        }
    }
}
