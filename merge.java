/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class merge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int[]arr=new int[]{1,2,3,4,5};
        int[]arr2=new int[]{6,7,8,9,10};
        int[]arr3=merge(arr,arr2);
        for(int i=0; i <arr3.length;i++){
            System.out.print(" "+arr3[i]);
        }
          

    
        }
    public static int[] merge(int[]arr,int[]arr2){
        int[]arr3= new int[arr.length+arr2.length];
        for(int i=0; i <arr.length;i++){  
            arr3[i]=arr[i];  
            
            }
        for(int i=0; i <arr.length;i++){  
            arr3[i+arr.length]=arr2[i];  
            
            }
        return arr3;
        
       
        }
        
}
 
    

