import javafx.scene.shape.Circle;

import java.awt.*;

/**
 * Created by parischrysanthou on 24/11/2017.
 */
class Player extends Shape{
    private int speed = 1;
    boolean right,left,up,down;
    private int width,height;


    public Player(int x, int y) {
       super(x,y);
       width = 10;
       height = 10;
    }

    public void tick(){
        if(right && canMove(x+speed,y)) x+=speed;
        if(left && canMove(x-speed,y)) x-=speed;
        if(up && canMove(x, y-speed)) y-=speed;
        if(down && canMove(x,y+speed)) y+=speed;
    }

    private boolean canMove(int nextx, int nexty){

        Rectangle bounds = new Rectangle(nextx, nexty,width,height);
        Maze maze = Game.maze;

        for(int x = 0; x < maze.tiles.length; x++){
            for(int y = 0; y < maze.tiles[0].length; y++){
                if(maze.tiles[x][y] != null){
                    if(bounds.intersects(maze.tiles[x][y])){
                        return false;
                    }
                }
            }
        }


        return true;
    }


    public void draw (Graphics g){
        g.setColor(Color.red);
        g.fillRect(x , y, 10, 10);
        tick();
    }

}