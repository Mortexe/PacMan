import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by parischrysanthou on 24/11/2017.
 */
public class Game {
    public static final int WIDTH = 555, HEIGHT = 640;
    public static Maze maze;

    public static void main(String[] args) {
        new Game();
    }


    public Game() {
        Dimension dimension = new Dimension(WIDTH,HEIGHT);
        JFrame frame = new JFrame("PacMan");
        frame.setPreferredSize(dimension);
        frame.add(new Board());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        maze = new Maze();
    }
}
