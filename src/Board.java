import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import java.util.Random;

/**
 * Created by parischrysanthou on 24/11/2017.
 */
public class Board extends JPanel implements ActionListener, KeyListener {

    private Maze map;
    private Player p;       // Player object

    public Board() {
        map = new Maze();
        p = new Player(22,22);

        addKeyListener(this);
        setFocusable(true);

        Timer timer = new Timer(10, this);
        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    // Paint Game
    public void paint(Graphics g) {
        // Draw map
        map.render(g);

        // Draw Player position
        p.draw(g);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent k) {

        int keycode = k.getKeyCode();


        if(keycode == KeyEvent.VK_RIGHT){
                p.right = true;
        }

        if(keycode == KeyEvent.VK_DOWN){
                p.down = true;
        }

        if(keycode == KeyEvent.VK_LEFT){
                p.left = true;
        }

        if(keycode == KeyEvent.VK_UP){
                p.up = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        int keycode = e.getKeyCode();

        if(keycode == KeyEvent.VK_RIGHT){
            p.right = false;
        }

        if(keycode == KeyEvent.VK_DOWN){
            p.down = false;
        }

        if(keycode == KeyEvent.VK_LEFT){
            p.left = false;
        }

        if(keycode == KeyEvent.VK_UP){
            p.up = false;
        }

    }
}
