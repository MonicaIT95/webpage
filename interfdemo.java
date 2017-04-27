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
interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class interfdemo implements Printable,Showable {
    public void print()
    {
        System.out.println("Hello");
        
    }
  public  void show()
    {
        System.out.println("welcome");
    }
public static void main(String arg[])
{
    interfdemo obj=new interfdemo();
    obj.print();
    obj.show();


}
    
}
