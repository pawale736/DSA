package com.cdac.day1;

import com.cdac.day1.P2.BinaryTree;
import com.cdac.day1.P2.Node;

public class P3 {

	public static class Node {
		private int data;
		private Node left;
		private Node right;

		Node(int newData) {
			this.data = newData;
			this.left = null;
			this.right = null;
		}
	}

	public static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}

			Node root = new Node(nodes[idx]);
			root.left = buildTree(nodes);
			root.right = buildTree(nodes);
			return root;
		}

	}

	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);

		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		int nodes[] = { 8, 3, 1, -1, -1, 6, 4, -1, -1, 7, -1, -1, 10, -1, 14, 13, -1, -1, -1 };// By default we will get
																								// preorder with null
																								// values or -1 values
		Node root = BinaryTree.buildTree(nodes); // here we are getting root by eliminating null values or -1
		System.out.println(root.data);
		preOrder(root); // here we are getting preorder of tree
		System.out.println();
		inOrder(root); // to find out inorder we have to find out first root of given preorder tree.
		System.out.println();
		postOrder(root);

	}

}
