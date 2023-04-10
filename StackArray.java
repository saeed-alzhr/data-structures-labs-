/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class StackArray {

    private int capacity; 
    private long[] a;
    private int nElems; 

public StackArray(int s) { 
        capacity = s; 
        a = new long[capacity]; 
        nElems = 0; 
    }

public void push(long j) { 
a[nElems] = j;
nElems++;
}

public long pop() { 
        int top = nElems- 1;
        long temp = a[top];
        nElems--;
        return temp;
       
    }

public long peek() {
        int top = nElems
                - 1;
        return a[top];
    }

public boolean isEmpty() { 
if (nElems == 0) {
            return true;
        } else {
            return false;
        }
    }

public boolean isFull() { 
        return (nElems == capacity);

    }
}
