package seminar1.Units;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Peasant extends Unit { // крестьянин
    public Peasant(ArrayList<Unit> team, String name) {
        super(1, team, name, 11, 1, new int[] {1,2});
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
