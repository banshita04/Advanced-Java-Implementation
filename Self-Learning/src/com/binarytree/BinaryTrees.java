package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTrees {

	static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree{
		static int index = -1;
		public static Node buildTree(int nodes[]) {
			index++;
			if(nodes[index]==-1) {
				return null;
			}

			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

	public static void preOrderTraversal(Node root) {

		if(root==null) {
			return;
		}

		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	public static void inOrderTraversal(Node root) {

		if(root==null) {
			return;
		}

		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}

	public static void postOrderTraversal(Node root) {

		if(root==null) {
			return;
		}

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void levelOrderTraversal(Node root) {
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currentNode = q.remove();
				if(currentNode == null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}else {
						q.add(null);
					}
				}else {
					System.out.print(currentNode.data+" ");
					if(currentNode.left!=null) {
						q.add(currentNode.left);
					}
					if(currentNode.right!=null) {
						q.add(currentNode.right);
					}
				}
			}
	}
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println("Built Tree Successfully!");
		System.out.println("Root of the binary tree: "+root.data);
		System.out.println("Preorder Traversal:-");
		preOrderTraversal(root);
		System.out.println("\nInorder Traversal:-");
		inOrderTraversal(root);
		System.out.println("\nPostorder Traversal:-");
		postOrderTraversal(root);
		System.out.println("\nLevel Order Traversal:-");
		levelOrderTraversal(root);
	}

}
