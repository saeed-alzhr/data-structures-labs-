
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class Sales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of salespeople you want to have.");
         int SALESPEOPLE= scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i = 0; i < sales.length; i++) {
        System.out.print("Enter sales for salesperson"+(i+1)+":");
        sales[i]=scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
System.out.println("------------------");
sum= 0;
int max=0;
int min=10000000;
int user;
int count=0;
        for (int i = 0;i < sales.length; i++) {
            
            System.out.println(" "+(i+1)+" " + sales[i]);
            sum+= sales[i];
            if(sales[i]>max){
            max=sales[i];
            }
            if(sales[i]<min){
            min=sales[i];
            }
        }
        System.out.println("\nTotal sales:"+sum);
        System.out.println("Average sales:"+sum/5);
        System.out.println("Max sales is:"+max);
        System.out.println("Min sales is:"+min);
        System.out.println("please enter a value");
        user=scan.nextInt();
        System.out.println("The salespeople who exceeded the value you entered are:");
        for (int i = 0;i < sales.length; i++) {
            if(user<= sales[i]){
            System.out.println(" "+(i+1)+" " + sales[i]);
            count++;
            }
        }
        System.out.println("The number of salespeople who exceeded the value you entered is:"+count);
        
        
}

}
