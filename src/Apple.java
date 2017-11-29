import java.awt.*;

/**
 * Created by parischrysanthou on 28/11/2017.
 */
class Apple extends Shape {
    private int width,height;
    public Apple(int x, int y){
        super(x,y);
        width = 7;
        height = 7;
    }

    public void render(Graphics g){
        g.setColor(Color.green);
        g.fillOval(x+5,y+5,width,height);
    }
}
