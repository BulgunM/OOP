package seminar1.Units;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Spearman extends Unit { // копейщик
    public Spearman(ArrayList<Unit> team, String name) {
        super(7, team, name, 12, 2, new int[] {1,3});
    }

    @Override
    public String toString() {
        return "Копейщик";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
