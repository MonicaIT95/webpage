/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author NIIT
 */
class A
{
    int m1=90,m2=88,m3=76;
    public void display()
    {
        System.out.println("M1"+m1);
        System.out.println("M2"+m2);
        System.out.println("M3"+m3);
    }
}
public class overridingdemo extends A {
    
    int m4=87;
    int m5=98;
    public void display()
    {
        
    System.out.println("M4"+m4);
    System.out.println("M5"+m5);
    
    
}
    public static void main(String arg[])
    {
        A a=new A();
        a.display();
        overridingdemo d=new overridingdemo();
        d.display();
        
        
    }
}
}
