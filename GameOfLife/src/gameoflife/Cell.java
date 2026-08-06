/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author w9d1o
 */
public class Cell {
   private boolean state;
   
   public Cell(boolean state){
       this.state = state;
   }
   
   private void setState(boolean state){
       this.state = state;
   }
   
   public boolean getState(){
       return this.state;
   }
   
   public void newState(int vecinos){
       if (this.getState()) {
           if (vecinos < 2 || vecinos > 3) {
               this.setState(false);
           } 
       } else if (vecinos == 3) this.setState(true);
   }
   
}
