package seminar1.Shooter;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Sniper extends Shooter{ // снайпер
    public Sniper(ArrayList<Unit> team, String name) {
        super(6, team, name, 12, 2, new int[] {1,3}, 1, 1, 1);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format("%s arrows: %d  accuracy: %d", super.getInfo(), this.arrows, this.accuracy);
    }
}
