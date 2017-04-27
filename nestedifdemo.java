/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR user
 */
public class nestedifdemo {
    public static void main(String args[])
    {
        int year=2017;
                if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("Leap Year");
            }
                else
                {
                System.out.println("Not Leap");
                        }
            }
        
        if(year%4==0)
        {
         System.out.println("Leap Year");   
        }
        else
        {
            System.out.println("Not leap");
        }
    }
    
}
