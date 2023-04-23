package seminar1.Magican;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Monk extends Magican { // монах
    public Monk(ArrayList<Unit> team, String name) {
        super(5, team, name, 14,3 , new int[] {1,4}, 2, 1);
    }

    @Override
    public String getInfo() {
        return String.format("%s Mana: %d  Accuracy: %d", super.getInfo(), this.mana, this.accuracy);
    }

    @Override
    public void step() {

    }
}
