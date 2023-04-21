package seminar1.Units;

import seminar1.Units.Unit;

public class Peasant extends Unit { // крестьянин
    public Peasant(String name) {
        super(name, 20, 10, 5, 1);
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
        return "имя: " + name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " урон: " + damage;
    }
}
