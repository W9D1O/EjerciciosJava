

package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    private boolean state;
    private SnakeGraphic snake;
    private ComidaGraphics comida;
    
    
    public Ventana(Snake snake, Comida comida, Color snakeColor,
                    Color comidaColor,
                    int alto, int ancho, int size) {
        
        setTitle("Snake");
        setSize(alto*size,ancho*size);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        this.snake = new SnakeGraphic(snake,snakeColor,size);
        this.comida = new ComidaGraphics(comida,comidaColor);
        state = true;
    }
    
    public boolean isRunning() {
        return state;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        //this.snake.drawSnake(g2);
        g2.setBackground(Color.black);
        g2.setColor(Color.black);
        g2.fillRect(0, 0, getWidth(), getHeight());
        this.snake.drawSnake(g2);
        this.comida.draw(g2);
    }
    
    public void update(double time) {
        Image image = createImage(getWidth(),getHeight());
        Graphics dbg = image.getGraphics();
        this.draw(dbg);
        getGraphics().drawImage(image, 0, 0, this);
    }
    

}