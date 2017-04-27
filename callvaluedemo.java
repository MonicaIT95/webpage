/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;

/**
 *
 * @author MR user
 */
public class callvaluedemo {
    int a=50;
  public  void change(int a)
    {
        a=a+50;
    }
    public static void main(String args[])
    {
        callvaluedemo obj=new callvaluedemo();
        System.out.println("Before Changed:"+obj.a);
        obj.change(100);
        System.out.println("After Changed:"+obj.a);
        
    }
}
