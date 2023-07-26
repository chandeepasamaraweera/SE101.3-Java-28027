
package com.mycompany._lab_ex4;

public class App {

    public static void main(String[] args) 
    {
        animal a = new animal();
      mammal m = new mammal();
      dog d = new dog();
      System.out.println(m instanceof animal);
      System.out.println(d instanceof mammal);
      System.out.println(d instanceof animal);

    }
}
