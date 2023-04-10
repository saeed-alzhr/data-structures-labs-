/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class random {
   
 public static void main(String[] args){   
   
  double[] myList=new double[5];   

for(int i= 0;i<myList.length; i++){
 myList[i]= Math.random() * 10;
    }
    for(int i=0;i<myList.length;i++){
        System.out.println(""+myList[i]);
    }
    
}
}