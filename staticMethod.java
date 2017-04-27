/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIIT
 */
public class static1demo {
    int x;
    static int sum;
    static1demo()
    {
        x=sum++;
        
        
    }
    static void display()
    {
        System.out.println("Sum"+sum);
    }
    void print()
    {
        System.out.println("X Value:"+x);
    }
public static void main(String arg[])
{
    static1demo s1=new static1demo();
    static1demo s2=new static1demo();
    static1demo s3=new static1demo();
    display();
    s1.print();
    s2.print();
    s3.print();
}
}
