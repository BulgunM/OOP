package seminar1.Units;

import seminar1.Units.Unit;

import java.util.ArrayList;

public class Spearman extends Unit { // копейщик
    public Spearman(String name, ArrayList<Unit> team, int x, int y){
        super(name, 30, 0.6f, 3, 3, 30, team, x, y);
    }

    @Override
    public String toString() {
        return "Копейщик";
    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
