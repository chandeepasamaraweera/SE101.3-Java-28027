
package com.mycompany._lab1;

public class bankaccount 
{
 private String ano;
 private float balance;
 public void setano(String a )
 {
     this.ano=a;
     
 }
 public String getano()
 {
     return ano; 
 }
 public void setbalance(float b )
 {
     this.balance=b;
     
 }
 public float getbalance()
 {
     return balance;
 }
public abstract void calculateinterest(); 
}
