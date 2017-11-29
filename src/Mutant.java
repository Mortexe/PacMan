/**
 * Created by parischrysanthou on 24/11/2017.
 */
public class Mutant {
    private int tileX, tileY, mobHP, mobDamage;

    public Mutant(){
        mobHP = 10;
        mobDamage = 10;
    }

    public int getMobDamage(){
        return mobDamage;
    }

    public int getMobHP(){
        return mobHP;
    }

    public void loseMobHP(int reduce){
        mobHP -= reduce;
    }

    public void move(int dx,int dy){
        tileX += dx;
        tileY += dy;
    }
}
