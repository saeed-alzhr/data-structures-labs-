/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class revers {
    public static void main(String[] args){
    int []a={1,2,3,4,5};
    int b[]=new int[a.length];
    revers(a,b);
    for(int i=0;i<b.length;i++){
        System.out.println(b[i]+"");
    }
    }
    public static int []revers(int[]a,int[]b){
        int j=a.length-1; 
        for (int i = 0; i < a.length; i++){
         b[j]=a[i];
         j--;
         }
        
        
        return b;
    
    }
    
}
