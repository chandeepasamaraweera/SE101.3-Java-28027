
package com.mycompany.practical1_5;
public class Practical1_5 {

    public static void main(String[] args) {
             int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
        System.out.println("i'm out of the loop now");

    }
}
