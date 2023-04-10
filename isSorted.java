/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class isSorted {
     public static void main(String[] args){
    int []a={1,4,5,8,9};
         System.out.println(isSorted(a));
     }
     public static boolean isSorted(int[]a){
         for(int i=0;i<a.length-1;i++){
             if(a[i]>a[i+1]){
         return false;
             }
         }
         return true;
     }
}
