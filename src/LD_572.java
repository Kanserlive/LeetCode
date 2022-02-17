public class LD_572 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
          //遍历树,如果第一轮的subRoot不为空，那么会遍历到底，到树底时，返回空，遍历完成，此时总的取值只看isSametree的取值
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(subRoot==null)return true;// subRoot 为 null 一定都是 true
            if(root==null)return false;// 这里 subRoot 一定不为 null, 只要 root 为 null，肯定是 false
            return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)||isSametree(root,subRoot);

        }
        //判断两树是否相等
        public boolean isSametree(TreeNode root,TreeNode subRoot){
            if(root==null&&subRoot==null)return true;//两个树的左侧到底了例如（root.left）和（subRoot.left），右侧同上
            if(root==null||subRoot==null)return false;//有一个树的左侧到底了，另一棵树的左侧没到底，说明不相等，返回false，右侧同上
            if(root.val!=subRoot.val)return false;//点不同也返回false
            return isSametree(root.left,subRoot.left)&&isSametree(root.right,subRoot.right);//树左边到底返回true，当右边也到底返回true时，并集才为true
        }
    }
}
