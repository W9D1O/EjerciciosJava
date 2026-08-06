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
public class GameOfLife {

    private Board board;
    

    public void newGeneration(){
        int dim = this.board.getDim();
        Matriz aux = new Matriz(dim,dim);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                Cell cell = new Cell(this.board.getMatriz()
                                             .getCell(i, j)
                                             .getState());
                cell.newState(this.board.neighborCalc(i, j));
                aux.setCell(i, j,cell);
            }
        }
        this.board = new Board(aux);
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
