/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author said
 */
public class bubble_sort {
    public static void main(String[] args){
    int []a={3,2,4,5,1,3};
    sorting(a);
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]+"");
    }
    }
    public static void sorting(int []a){
       
        int temp;
        for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a.length-1; j++) {
     if (a[j] < a[j + 1]) {
      temp = a[j];
      a[j] = a[j +1];
      a[j + 1] = temp;
     }
    }
    }
         
}
}
