/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class rang {
     public static void main (String[] args){
         int a[]={12,2,100,3,7};
         System.out.println(range(a));
         
     }
    public static int range(int []a){
        int max=0;
        int min=a[0];
        for(int i=0;i<a.length;i++){
        if(a[i]>max){
        max=a[i];
        }
        
      if(a[i]<min){
        min=a[i];        
        }
        }
         return max-min;
    }
}
