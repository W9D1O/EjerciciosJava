

package snake;

import java.awt.Color;
import java.awt.event.KeyEvent;
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
        ventana = new Ventana(snake, comida,
                    Color.LIGHT_GRAY,
                    Color.RED, ALTO, ANCHO, SIZE);
        
        this.input = new KeyInput();
        ventana.addKeyListener(input);
        ventana.setFocusable(true);
        ventana.requestFocusInWindow();
    }
    
    
    public boolean hayColision() {
        boolean vf = false;
        int maxX = ventana.getWidth() / SIZE;
        int maxY = ventana.getHeight() / SIZE;
        if (snake.getHeadPosicion().getX() < 0 || 
                snake.getHeadPosicion().getY() < 0 ||
                snake.getHeadPosicion().getX() > maxX ||
                snake.getHeadPosicion().getY() > maxY) {
            vf = true;
        }
        return snake.cuerpoColision() || vf;
    }
    
    
    public Vector capturarInput() {
        Vector dir;
        if (input.isKeyPressed(KeyEvent.VK_W) ||
                input.isKeyPressed(KeyEvent.VK_UP)) dir = new Vector(0,-1);
        else if (input.isKeyPressed(KeyEvent.VK_S) ||
                input.isKeyPressed(KeyEvent.VK_DOWN)) dir = new Vector(0,1);
        else if (input.isKeyPressed(KeyEvent.VK_A) ||
                input.isKeyPressed(KeyEvent.VK_LEFT)) dir = new Vector(-1,0);
        else if (input.isKeyPressed(KeyEvent.VK_D) ||
                input.isKeyPressed(KeyEvent.VK_RIGHT)) dir = new Vector(1,0);
        else dir = new Vector(0,0);
        
        return dir;
        
    }
    
    public void input() {
        this.snake.setDireccion(capturarInput());
    }
    
    @Override
    public void run() {
        double lastFrameTime =  0.0;
        try {
            while (ventana.isRunning()) {
                /*No estoy seguro si es buena idea chequear esto
                constantemente o si lo tendria que hacer caba veaz que
                se actualiza la ventana por el momento vamos a cheqauearlo
                constantemente*/
                this.snake.mover();
                input();
                comida.actualizarPosicion(ALTO, ANCHO);
                comida.setEstado(this.snake.comer(comida));
                this.snake.crecer();
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
