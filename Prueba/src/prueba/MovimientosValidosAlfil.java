package prueba;

public class MovimientosValidosAlfil {

    public static int absoluto(int x) {
        if (x < 0) x *= -1;
        return x;
    }

    public static void main(String[] args) {
        int max = 8;
        boolean[][] tablero = new boolean[max][max];
        //Inicializamos la matrix
        for (int i = 0; i < max*max; i++) {
            tablero[i / max][i % max] = false;
        }
        //Generamos un valor random
        int pos = (int)(Math.random() *(max*max));
        tablero[pos / max][pos % max] = true;
        int x = pos % max;
        int y = pos / max;

        for (int j = 0; j < max; j++) {
            for (int k = 0; k < max; k++) {
                    int disX = absoluto(x - k);
                    int disY = absoluto(y -j);
                    
                    if (disX == disY) {
                        tablero[j][k] = true;
                    }
            }
        }
        
        System.out.println("El alfil se encuentra ubicado en Pos y: " + y
        + " Pos x: " + x);
        for (int l = 0; l < max*max; l++) {
            if (l != 0 && l % max == 0) {
                System.out.println();
            }
            
            if (tablero[l / max][l % max]) {
                System.out.print("* ");
            } else System.out.print("# ");
        }
        

    }

}
