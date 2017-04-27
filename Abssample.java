/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;

 abstract class Bike{
     abstract void run();
 } 
public class AbsDemo extends Bike {
 void run()
 {
     System.out.println("Running Safety...");
 }
 public static void main(String arg[])
 {
    AbsDemo obj=new AbsDemo();
    obj.run();
}
}
