/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1;

/**
 *
 * @author asus
 */
   public class Pertama {
   private int a = 10;
   protected void terprotek(){
       System.out.println("Method ini hanya untuk anaknya");
   }
   public void info(){
       System.out.println("a = "+a);
       System.out.println("dipanggil pada = "+this.getClass ().getName());
   }
}
