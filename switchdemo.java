/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIIT
 */
import java.util.*;
public class switchdemo {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the Number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a=10;
        int b=20;
        int c;
        switch(n)
        {
                
                case 1:
                c=a+b;
                System.out.println("Addition:"+c);
                break;
                case 2:
                c=a-b;
                System.out.println("Subtraction:"+c);
                break;
                case 3:
                    c=a*b;
                    System.out.println("Multiplication:"+c);
                    break;
                case 4:
                    c=a/b;
                    System.out.println("divisiom"+c);
                    break;
                default:
                    System.out.println("Invalid Number");
    }
    
}
}
