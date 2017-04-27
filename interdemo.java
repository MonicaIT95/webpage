/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;

/**
 *
 * @author NIIT
 */
 interface printable {
     void print();
        
}
public class interdemo implements printable{
   public  void print()
    {
        System.out.println("Hello");
        
    }
    public static void main(String arg[])
    {
        interdemo obj=new interdemo();
        obj.print();
    }
}
