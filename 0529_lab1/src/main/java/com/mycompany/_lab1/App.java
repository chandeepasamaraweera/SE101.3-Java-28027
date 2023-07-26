
package com.mycompany._lab1;

public class App {

    public static void main(String[] args) 
    {
     employee e1=new employee();
     employee e2=new employee();
     
     e1.seteID(10);
     e1.setEname("bogdan");
     e1.setEd("dfghj");
     
     e2.seteID(20);
     e2.setEname("bird");
     e2.setEd("sdfghj");
     
        System.out.println("emplyee name= "+e1.getEname());
        System.out.println("emp ID = "+e1.geteID());
        System.out.println("emp d = "+e1.getEd());
        System.out.println("");
        
        System.out.println("emplyee name= "+e2.getEname());
        System.out.println("emp ID = "+e2.geteID());
        System.out.println("emp d = "+e2.getEd());
     
     
    }
}
