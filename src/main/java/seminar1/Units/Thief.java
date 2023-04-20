package seminar1.Units;

import seminar1.Units.Unit;

public class Thief extends Unit { // разбойник

    public Thief(String name) {
        super(name, 20, 0.8f, 3, 2);
    }

    @Override
    public String toString() {
        return name;
    }

    void dodge() {};
    void stealth() {};
}
