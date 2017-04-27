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


public class methodoverdemo {
    
    
    void Maximum(int a,int b)
    {
        if(a>b)
        {
            System.out.println("A is Largest");
                    
        }
        else
        {
            System.out.println("B is Biggest");
        }
    }
     void Maximum(float x,float y)
     {
         if(x>y)
         {
             System.out.println("A is Largest");
                    
        }
        else
        {
            System.out.println("B is Biggest");
        }
    }
     
   void Maximum(char a,char b)
   {
       if(a>b)
       {
         System.out.println("A is Largest");
                    
        }
        else
        {
            System.out.println("B is Biggest");
        }
    }      
   public static void main(String arg[])
   {
       methodoverdemo obj=new methodoverdemo();
       obj.Maximum(5, 8);
       obj.Maximum(7.5f,4.6f);
       obj.Maximum('s','e');
   }
   }
     
