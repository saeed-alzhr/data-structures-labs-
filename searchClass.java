/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class searchClass {
    public static void main(String[] args){
     int []a={1,2,4,8,9,12,18,23,27};
     int s=9;
    
        System.out.println(bainrySearch(a,s));
    }
    public static int  bainrySearch(int[]a,int s){
        int r=a.length-1;
        int l=0;
       
       while(l<=r){//logn
         int m=r+l/2;
        if(a[m]==s){
        return m;
        }
        if(a[m]>s){
        r=m-1;
        
    }else l=m+1; 
       }
        return -1;
    
    }
    
}
