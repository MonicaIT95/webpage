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

 class Person {
    int id;
    String name;
   public Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    }
 class SuperDemo extends Person{
   
      public float salary;
    SuperDemo(int id,String name,float salary)
    {
        super(id,name);
        this.salary=salary;
     }
    void display()
        {
            System.out.println("Name : "+name);
            System.out.println("Id : "+id);
            System.out.println("Salary : "+salary);
        }
     
    public static void main(String[] args) {
      SuperDemo s=new SuperDemo(98,"moni",4500);
          s.display();
    }
    
}
