/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class tNode {
    int data;
    tNode left;
    tNode right;
    public tNode(int d){
        data = d;
        left = null;
        right = null;
    }
    public String toString(){
        return data  + "  ";
    }
}
    

