/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class withOutDuplicate {

    public static void main(String[] args) {
        int[] a = new int[]{1,4,8,2,4,4,3,3,5,9,6,6,6,7,7};
        
        bubble_sort.sorting(a);
         int []b=withOutDuplicate(a);
       for (int i=0; i<b.length; i++)  
           System.out.print(b[i]+" "); 
       
            
        
        

    }

    public static int[] withOutDuplicate(int[] a) {
       int count=0;
        for (int i = 0; i < a.length-1; i++) {
          if(a[i]!=a[i+1]){
          a[count]=a[i];
          
          count++;
          }
            }
        
        a[count] = a[a.length-1];
        count++;
        int [] b;
        b=new int[count];
        for(int i=0;i<count;i++){
        b[i]=a[i];
        }
        return b;
       

        } 
        
    }
        
        
