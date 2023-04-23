package seminar1.Shooter;

import seminar1.GameInterface;
import seminar1.Units.Unit;

import java.util.ArrayList;

public abstract class Shooter extends Unit implements GameInterface {
     protected int arrows, maxArrows, accuracy;

    public Shooter(int init, ArrayList<Unit> team, String name, int health, int armor, int[] damage, int arrows, int maxArrows, int accuracy) {
        super(init, team, name, health, armor, damage);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.accuracy = accuracy;
    }

    void shoot() {};
}
