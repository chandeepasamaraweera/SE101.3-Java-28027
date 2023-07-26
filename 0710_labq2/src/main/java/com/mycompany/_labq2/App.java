
package com.mycompany._labq2;

public class App {

    public static void main(String[] args)
    {
      
      int arr[]=new int[3];
      
      try
      {
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;
         arr[5]=5;
       
           System.out.println("last element= "+arr[5]);
          
      }
    
      catch(ArrayIndexOutOfBoundsException e)
          
        {
            System.out.println("array index error");
        }
      
     
    }
}
