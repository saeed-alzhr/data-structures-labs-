/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author said
 */
public class Power {

    public static void main(String[] args) {
        int base, exp;
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the power program! ");
        System.out.println("Please use integers only.");
//getbase 
        System.out.print("Enter the base you would like raised to a power:");
        base = scan.nextInt();
//get exponent 
        System.out.print("Enter the power you would like it raised to: ");
        exp = scan.nextInt();
        answer = powerRec(base, exp);
        System.out.println(base + " raised to the " + exp + " is " + answer);
        
    }

   /* public static int power(int base, int exp) {
        int pow;
        if (exp != 0) {
            int base1 = base;
            for (int i = 1; i < exp - 1; i++) {
                base1 = base1 * base;
            }
            pow = base * base1;
        } else {
            pow = 1;
        }

        return pow;

    }
*/
    public static int powerRec(int base, int exp) {
        int pow = 1;
        if (exp == 0) {
            return pow;
        } else {
            return base * powerRec(base, exp - 1);
        }

    }

}
