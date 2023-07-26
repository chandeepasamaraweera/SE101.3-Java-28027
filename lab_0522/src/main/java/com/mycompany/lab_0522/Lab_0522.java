package com.mycompany.lab_0522;

public class Lab_0522 {

    public static void main(String[] args)
    {
       test t1=new test();
       t1.setage(25);
       t1.setname("asdf");
       t1.sets(1258743);
        System.out.println("name= "+t1.getname());
        System.out.println("age= "+t1.getage());
        System.out.println("salary= "+t1.gets());
        
        test2 t2=new test2();
        t2.setdata(30, "zxcv", 987456);
    }
}
