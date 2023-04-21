package seminar1.Units;

import seminar1.Units.Unit;

public class Thief extends Unit { // разбойник

    public Thief(String name) {
        super(name, 20, 0.8f, 3, 2);
    }

    @Override
    public String toString() {
        return "Разбойник";
    }

    void dodge() {};
    void stealth() {};

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "имя: " + name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " урон: " + damage;
    }
}
