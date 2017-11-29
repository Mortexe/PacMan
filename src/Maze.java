import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * Created by parischrysanthou on 26/11/2017.
 */
class Maze {

    private int height, width;
    public Tile[][] tiles;
    public List<Apple> apples;


    public Maze(){
        openFile();
    }

    public void openFile() {
        apples = new ArrayList<>();

        try {
            File file = new File("src/maze.txt");
            Scanner scan = new Scanner(file);
            String line;

            // Read File
            while(scan.hasNextLine()){
                line = scan.nextLine();
                width = line.length();
                height++;
            }

            Scanner scan2 = new Scanner(file);

            tiles = new Tile[height][width];

            // Draw Map
            for(int j = 0; j<height;j++){
                String readLines = scan2.nextLine();

                for(int i =0; i<width; i++){

                    if(readLines.charAt(i) == '0'){
                        tiles[j][i] = new Tile(i*20,j*20);

                    }
                    else {
                        apples.add(new Apple(i*20,j*20));
                    }

                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void render(Graphics g){
        for(int x = 0 ; x<height; x++){
            for(int y=0; y<width; y++){
                if(tiles[x][y] != null)
                tiles[x][y].render(g);

            }
        }

        for(int i=0; i < apples.size(); i++){
            apples.get(i).render(g);
        }
    }
}
