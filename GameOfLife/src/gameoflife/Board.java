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
public class Board {
    private final int n = 4;
    private Matriz matriz;
    
    public Board(){
        this.matriz = new Matriz(this.n,this.n);
    }
    
    public Board(Matriz  matriz){
        this.matriz = matriz;
    }
    
    public int getDim(){
        return this.n;
    }
    
    
    private int offset(int pos, int index) {
        return (this.getDim() + index + pos) % this.getDim();
    }
    

    
    public Matriz getMatriz(){
        return this.matriz;
    }
        
    public int neighborCalc(int x, int y){
        int n = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int actualX = offset(x,i);
                int actualY = offset(y,j);
                if (actualX != x && actualY != y || actualX != x && actualY == y
                        || actualX == x && actualY != y) {
                    if (this.matriz.getCell(actualX,actualY).getState()) n++;
                }
            }
        }
        return n;
    }
    

    
}
