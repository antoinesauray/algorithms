package net.sauray.algorithms;

import java.util.*;

class DepthFirstSearch {

		public static List<Integer> inorderTraversalRec(TreeNode root) {
				List<Integer> res = new LinkedList<>();
				if(root == null) { return res; }
				if(root.left != null) {
						res.addAll(inorderTraversalRec(root.left));
				}
				res.add(root.val);
				if(root.right != null) {
						res.addAll(inorderTraversalRec(root.right));
				}
				return res;
		}

    public static List<Integer> inorderTraversalIter(TreeNode root) {
       return null;
    }

		public List<Integer> postorderTraversalRec(TreeNode root) {
				List<Integer> res = new LinkedList<>();
				if(root == null) { return res; }
				if(root.left != null) {
						res.addAll(postorderTraversalRec(root.left));
				}
				if(root.right != null) {
						res.addAll(postorderTraversalRec(root.right));
				}
				res.add(root.val);
				return res;
		}

    public List<Integer> postorderTraversalIter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        List<Integer> integers = new LinkedList<>();
        
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode last = stack.pop();
            if(last != null) {
                stack2.push(last.val);
                stack.push(last.left);
                stack.push(last.right);
            }
        }
        
        while(!stack2.isEmpty()) {
            integers.add(stack2.pop());
        }
        return integers;
    }

		public static List<Integer> preorderTraversalRec(TreeNode root) {
        List<Integer> integers = new LinkedList<>();
        
        integers.add(root.val);
        
        if(root.left != null) {
            integers.addAll(preorderTraversalRec(root.left));
        }
        if(root.right != null) {
            integers.addAll(preorderTraversalRec(root.right));
        }
        return integers;
    }
    
    public static List<Integer> preorderTraversalRecIter(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> integers = new LinkedList<>();
        
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode popped = stack.pop();
            if(popped != null) {
                integers.add(popped.val);
                stack.push(popped.right);
                stack.push(popped.left);
            }  
        }
        
        return integers;
    }

		public static void main( String[] args )
    {
				//[3,9,20,null,null,15,7]
				TreeNode tree = new TreeNode(
						3,
						new TreeNode(
								9,
								null,
								null
						),
						new TreeNode(
								20,
								new TreeNode(15, null, null),
								new TreeNode(7, null, null)
						)
				);
				List<Integer> result = inorderTraversalRec(tree);
				System.out.println(result);
    }
}
