/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;

/**
 *
 * @author MR user
 */
public class callrefdemo {
    
     int data=50;  
  
 void change(callrefdemo op){  
 op.data=op.data+100;
     
    
 public static void main(String args[]){  
   callrefdemo op=new callrefdemo();  
  
   System.out.println("before change "+op.data);  
   op.change(op);
   System.out.println("after change "+op.data);  
 }
}