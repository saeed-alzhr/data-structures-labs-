/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class LinkedList {
    Node first;
    int count;
    
   public void addFirst(int n){
        Node temp =new Node(n);
    temp.next =first;
    first=temp;
   count++;
    }
    public void deleteFirst(){
         first=first.next;
         count--;
     
     }
    
    public void addLast(int n){
     if(first==null){
     addFirst(n);
     return;
     }
     
     Node temp=first;
     while(temp.next!=null){
     temp=temp.next;
     }
     Node last=new Node(n);
     temp.next=last;
     count++;
     
     }
    public void addAt(int idx,int k){
    Node temp=first;
    Node n=new Node(k);
    if(idx==count){
        addLast(k);
        
    }
    if(idx==0){
        addFirst(k);
    }
    if(idx>0 && idx<count){
    for(int i=0;i<idx-1;i++){
        temp=temp.next;
    }
    n.next=temp.next;
    temp.next=n;
    count++;
    }
    
    else 
    System.out.println(" out of rang");
    }
    
     public Node getAt(int idx){
        Node temp=first;
      if(idx>=count ||0 <idx)
          return null ;
    for(int i=0;i<idx-1;i++){
    temp=temp.next;
    }
    return temp;
    
    }
    public void mysteryMethod() {
        if (first
                != null) {
            Node p
                    = first;
            while (p.next
                    != null) {
                p= p.next;
            }
            System.out.println(p.data);
        }
// end if
    }

    
      
    public void display(){
         Node temp=first;
     while(temp!=null){
         System.out.print(" "+temp.data);
     temp=temp.next;
     }
     }
}
