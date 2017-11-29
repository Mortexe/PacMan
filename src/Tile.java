import java.awt.*;

/**
 * Created by parischrysanthou on 28/11/2017.
 */
public class Tile extends Rectangle {

    public Tile(int x, int y){
        setBounds(x,y,20,20);

    }

    public void render(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x,y,width,height);
    }
}
