
package com.mycompany._lab1;

public class interfaceimplemented implements myfirstinterface
{    public void display()
    {
        /* 3.no it is not possible to change x because the variable x is a constant inside the interface*/
        x=5;
        System.out.println("x="+x);
    }
}
