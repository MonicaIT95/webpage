/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR user
 */

public class constructordemo {
    int a,b,c;
    constructordemo()
    {
       
        a=10;
        b=20;
        c=a+b;                         
       
    }
    constructordemo(int x,int y)
    {
        
        a=x;
        b=y;
        c=x+y;
    }
    void display()
    {
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println("Sum:"+c);
    }
    public static void main(String args[])
    {
        constructordemo obj=new constructordemo();
        constructordemo obj1=new constructordemo(15,30);
        
        obj.display();
        obj1.display();
    }
}
