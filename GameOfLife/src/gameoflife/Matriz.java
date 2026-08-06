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
public class Matriz {
     private Cell[][] m;
     
     public Matriz(int x,int y){
         this.m = new Cell[x][y];
         for (int i = 0; i < x; i++) {
             for (int j = 0; j < y; j++){
                 this.m[i][j] = new Cell(false);
             }
         }
     }
     
     public Cell getCell(int x, int y){
        return this.m[x][y];
    }
     
     public void setCell(int x, int y, Cell cell){
         this.m[x][y] = cell;
     }
}
