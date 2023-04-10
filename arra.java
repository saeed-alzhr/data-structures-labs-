/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class arra {
    public static void main(String[] args){
    int []a=new int[6];
    a[0]=4;
    a[1]=6;
    a[2]=8;
    a[3]=9;

 
        System.out.println(add(a,7));
    for(int i=0;i<a.length;i++){
        System.out.print(" "+a[i]);
    }
    }
     public  static int add( int[]a,int n){
     int z=0;
         for(int i=0;i<a.length;i++){
     if(a[i]>n){
         z=i;
         for(int j=i;j<a.length-1;j++){
           
         a[j]=a[j+1];
     
         
         }
     }
     
     }
      return z;   
     }
    
}
