/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class LinkedListTest {
    public static void main(String[] args) {
    LinkedList L= new LinkedList();
    L.addLast(2);
    L.addLast(5);
    L.addLast(3);
    L.addLast(7);
    L.addLast(1);
    //L.addAt(0, 6);
  //  L.display();
   /* System.out.println("\nThis linkedList has: "+L.count);
    Node d5=L.getAt(0);
    System.out.println("The index of 0 is:"+d5);
    L.display();
    System.out.println("");*/
    L.mysteryMethod();
    }
    
}
