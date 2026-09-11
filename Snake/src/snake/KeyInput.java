

package snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyInput extends KeyAdapter implements KeyListener {
    private boolean[] keyPress = new boolean[128];
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() < 128)
        keyPress[e.getKeyCode()] = true;
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() < 128)
        keyPress[e.getKeyCode()] = false;
    }
    
    public boolean isKeyPressed(int keyCode) {
        boolean vf = false;
        if (keyCode < 128) {
            vf = keyPress[keyCode];
        }
        return vf;
    }
}
