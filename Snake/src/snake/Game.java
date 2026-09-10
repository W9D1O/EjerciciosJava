

package snake;

import java.awt.Color;
import static snake.Time.getTime;


public class Game implements Runnable {
    private Ventana ventana;
    private Snake snake;
    private Comida comida;
    private KeyInput input;
    private final int SIZE = 20;
    private final int ALTO = 40;
    private final int ANCHO = 30;
    
    public Game() {
        this.snake = new Snake(new Vector(ANCHO/2,ALTO/2));
        this.comida = new Comida(ANCHO,ALTO);
        ventana = new Ventana(snake,
                    Color.LIGHT_GRAY,
                    Color.RED, ALTO, ANCHO, SIZE);
    }
    
@Override
public void run() {
    double lastFrameTime =  0.0;
    try {
        while (ventana.isRunning()) {
            double time = getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;
                
            ventana.update(deltaTime);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
