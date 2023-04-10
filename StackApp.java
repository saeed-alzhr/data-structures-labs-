/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class StackApp {
    public static void main(String[] args) {
        StackArray theStack = new StackArray(2);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        while (!theStack.isEmpty()) { 
            long value= theStack.pop(); 
            System.out.println(value); 
            System.out.print(" ");
        } 
        System.out.println("");
    }
    
}
