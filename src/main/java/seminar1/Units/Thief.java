package seminar1.Units;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Thief extends Unit {

    protected int invisibility;

    public Thief(int init, ArrayList<Unit> team, String name, int health, int armor, int[] damage, int invisibility) {
        super(init, team, name, health, armor, damage);
        this.invisibility = invisibility;
    }

    public Thief(ArrayList<Unit> team, String name) {
        this(7, team, name, 10, 1, new int[]{1, 3}, 2);
    }

    @Override
    public String getInfo() {
        return String.format("%s  invisibility: %d", super.getInfo(), this.invisibility);
    }

    @Override
    public void step() {

    }
}






