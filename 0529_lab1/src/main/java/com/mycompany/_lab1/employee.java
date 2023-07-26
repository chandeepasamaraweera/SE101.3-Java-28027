
package com.mycompany._lab1;

public class employee 
{
   private int eID;
   private String Ename;
   private String Ed;
   
   public void seteID(int a)
   {
       eID=a;
   }
   public void setEname(String b)
   {
       Ename=b;
       
   }
   public void setEd(String c)
   {
       Ed=c;
   }
   public int geteID()
   {
       return eID;
   }
   public String getEname()
   {
       return Ename;
   }
   public String getEd()
   {
       return Ed;
   }
}
