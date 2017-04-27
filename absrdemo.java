/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;


abstract class Bank{
    void deposite()
    
    {
        System.out.println("deposite all the Money");
        
    }
    void withdraw()
    {
        System.out.println("Withdraw all the Money");
    }
   public abstract void calculateInterest();
}
class Hdfc extends Bank{
  public void calculateInterest()
  {
      System.out.println("Hdfc to calculate interest in the bank");
  }
}
 class absrdemo extends Bank{
  public void calculateInterest()
    {
        System.out.println("to calculate Interest in the Bank");
       
    }
    public static void main(String arg[])
    {
        Hdfc h=new Hdfc();
        absrdemo obj=new absrdemo();
        h.deposite();
        h.withdraw();
        h.calculateInterest();
               
        
       obj.deposite();
        obj.withdraw();
        obj.calculateInterest();
              
    }

    

   
}
