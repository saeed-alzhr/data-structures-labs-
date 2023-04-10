/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class findTimes {
     public static void main(String[] args){
      int f=2;
         int []a={1,2,2,3,3,3,4,4,4};
         System.out.println(findTimes(a,f));
     }
     
     
    public static int findTimes(int[]a,int f){
       
         int count=0;
       for(int i=0;i<a.length;i++){
       if(a[i]==f){
         count++;  
       }
       } 
        
        
        return count;
    
    }
}
