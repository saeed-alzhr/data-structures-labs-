/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class tree {
    tNode root;
    public void insert(int d) {
        if (root == null) {
            root = new tNode(d);
            return;
        }
        tNode current = root;
        tNode prev = null;
        while (current != null) {
            prev = current;
            if (d > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        if (d > prev.data) {
            prev.right = new tNode(d);
        } else {
            prev.left = new tNode(d);
        }

    }
    
    boolean search(int n) {
       tNode chers = root;
       
       while(chers != null){
           if(chers.data==n){
               return true;
           }
          if (n > chers.data){
              chers=chers.right;
          }else{
              chers=chers.left;
              
          }             
          }
      return false;
    }

    public int max() {
        tNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    
    public int min() {
        tNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public void preOrder(){
        System.out.println("PreOrder");
        preOrder(root);
        System.out.println("");
    }
    public void preOrder(tNode n) {
        if (n != null) {
            System.out.print(n);
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void inOrder(){
        System.out.println("inOrder");
        inOrder(root);
        System.out.println("");
    }
    public void inOrder(tNode n) {
        if (n != null) {
            inOrder(n.left);
            System.out.print(n);
            inOrder(n.right);
        }
    }

     public void postOrder(){
        System.out.println("postOrder");
        postOrder(root);
        System.out.println("");
    }
    public void postOrder(tNode n) {
        if (n != null) {
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n);
     
        }
    }
    public void levelOrder(){
        System.out.println("levelOrder");
        
        levelOrder(root);
        System.out.println("");
    }
    public void levelOrder(tNode n) {
            System.out.print(n);
        if (n != null) {
        
            System.out.print(n.left);
            System.out.print(n.right);
           levelOrder(n.left);
           levelOrder(n.right);
        }
    }
    public int count(){
       
    
     return count(root);
    }
    int count(tNode n){
    if (n==null)
        return 0;
    
    else 
       return 1+count(n.left)+count(n.right);
    }
}
