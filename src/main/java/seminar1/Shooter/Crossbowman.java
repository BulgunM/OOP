package seminar1.Shooter;

import seminar1.Shooter.Shooter;
import seminar1.Units.Unit;

import java.util.ArrayList;

public class Crossbowman extends Shooter { // арбалетчик

    public Crossbowman(ArrayList<Unit> team, String name) {
        super(6, team, name, 10, 2, new int[] {1,3}, 1, 1, 1);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format("%s arrows: %d  accuracy: %d", super.getInfo(), this.arrows, this.accuracy);
    }
}

