/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*Depth-first search (DFS) is a traversal algorithm used for both Tree and Graph data structures. 
 * The depth-first search goes deep in each branch before moving to explore another branch.*/
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;

public class dfs {
	// DFS has 3 ways of travarsal, preOrder, inOrder and postOrder. in this example we used inOrder.
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
		System.out.println(inorderTraversal(root));
	}
	
    static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
        	//in inOrder traversal we go left then parent then right.
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }
}
