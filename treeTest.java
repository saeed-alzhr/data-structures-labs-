/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class treeTest {
    public static void main(String[] args) {
        tree t = new tree();
        t.insert(5);
        t.insert(9);
        t.insert(3);
        t.insert(7);
        t.insert(12);
        t.insert(1);
        t.insert(4);
        t.insert(6);
        t.insert(8);
        t.insert(2);
        t.preOrder();
        t.inOrder();
        t.postOrder();
        t.levelOrder();
        System.out.println("Is this number exist "+t.search(9));
        System.out.println("This is the max number "+t.max());
        System.out.println("This is the min number "+t.min());
        System.out.println("This is the count of the tree "+t.count());
    
}
}