package binaryTree;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
          BinaryNode root;
          BinaryTreeLL(){
        	  this.root=null;
          }
	//preOrder Traversal
    //Root->Left->Right
          void preOrder(BinaryNode node) {
        	  if(node ==null) {
        		  return;
        	  }
        	 System.out.print(node.value+ " ");
        	 preOrder(node.left);
        	 preOrder(node.right);
          }
         void inOrder(BinaryNode node) {
        	 if(node==null) {
        		 return;
        		 
        	 }
        	 inOrder(node.left);
        	 System.out.print(node.value+ " ");
        	 inOrder(node.right);
        	 
        	 
         }
         void postOrder(BinaryNode node) {
        	 if(node==null) {
        		 return;
        	 }
        	 postOrder(node.left);
        	 postOrder(node.right);
        	 System.out.print(node.value+ " ");
        	 
         }
         void levelOrder() {
        	Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        	queue.add(root);
        	while(!queue.isEmpty()) {
        		BinaryNode presentNode =queue.remove();
        		System.out.print(presentNode.value+ " ");
        		if(presentNode.left!=null) {
        			queue.add(presentNode.left);
        		}
        		if(presentNode.right!=null) {
        			queue.add(presentNode.right);
        		}
        	}
        	
        	 }
        public  void search(String value) {
        	 Queue<BinaryNode> queue =new LinkedList<BinaryNode>();
        	 queue.add(root);
        	 while(!queue.isEmpty()) {
        		 BinaryNode presentNode=queue.remove();
        		 if(presentNode.value==value) {
        			 System.out.println("Node found with the value" +value+ "in the tree ");
        			 return;
        		 }
        		 else {
        			 if(presentNode.left!=null) {
        				 queue.add(presentNode.left);
        			 }
        			 if(presentNode.right!=null) {
        				 queue.add(presentNode.right);
        			 }
        		 }
        	 }
        	 System.out.println("Value not found in the tree");
        	 
         }
         }

