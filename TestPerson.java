/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author said
 */
public class TestPerson {
    public static void main(String args[]){
    Person p1=new Person();
    p1.setName("saeed");
    p1.setAge(20);
    p1.setHeight(170.5);
    Person p2=new Person("ahamed",23,175.9);
    System.out.println( p1.toString());
        System.out.println(p2.toString());
   
    }
    
}
