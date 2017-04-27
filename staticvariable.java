/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIIT
 */
public class staticdemo {
     int a;
     static int b;
     staticdemo()
     {
         b++;
        
     }
    public void showdata()
    {
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
    }
public static void main(String arg[])
{
    staticdemo f1=new staticdemo();
    f1.showdata();
    staticdemo f2=new staticdemo();
    f2.showdata();
    }

}

