package seminar1;

import seminar1.Units.Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Unit> enemy);
    String getInfo();
}
