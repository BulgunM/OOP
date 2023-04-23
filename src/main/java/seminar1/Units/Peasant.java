package seminar1.Units;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Peasant extends Unit { // крестьянин
    public Peasant(String name, ArrayList<Unit> team) {
        super(name, 10, 0.5f, 1, 1, 0, team);
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
