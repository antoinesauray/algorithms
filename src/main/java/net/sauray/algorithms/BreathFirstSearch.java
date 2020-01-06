package net.sauray.algorithms;

import java.util.*;

class BreadthFirstSearch {

		public static List<Integer> levelorderTraversalRec(TreeNode root) {
				List<Integer> integers = new LinkedList<>();
				integers.add(root.val);
				integers.addAll(levelorderTraversalRec2(root));
				return integers;
		}
		public static List<Integer> levelorderTraversalRec2(TreeNode root) {
				List<Integer> integers = new LinkedList<>();
				if(root.left != null) {
						integers.add(root.left.val);
				}
				if(root.right != null) {
						integers.add(root.right.val);
				}

				if(root.left != null) {
						integers.addAll(levelorderTraversalRec2(root.left));
				}
				if(root.right != null) {
						integers.addAll(levelorderTraversalRec2(root.right));
				}
				return integers;
		}


		public static void main( String[] args )
    {
				TreeNode tree = new TreeNode(
						1,
						new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
						new TreeNode(3,null, null)
				);
				List<Integer> result = levelorderTraversalRec(tree);
				System.out.println(result);
    }
}
