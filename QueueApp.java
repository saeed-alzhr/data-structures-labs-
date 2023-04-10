/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class QueueApp {

    public static void main(String[] args) {
        QueueArray theQueue = new QueueArray(2); 
        theQueue.enqueue(20);
        theQueue.enqueue(40);
        theQueue.enqueue(60);
        theQueue.enqueue(80);
        int s = theQueue.nElems;
        System.out.println(s);
        while (!theQueue.isEmpty()) { 
            long value = theQueue.dequeue(); 
            System.out.print(value); 
            System.out.print(" ");
        } // end while
        boolean e=theQueue.isFull();
        System.out.println(e);
    }
}
