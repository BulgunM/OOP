package seminar1.Units;

import seminar1.Units.Unit;

public class Spearman extends Unit { // копейщик
    public Spearman(String name) {
        super(name, 30, 0.6f, 2, 4);
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
        return "имя: " + name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " урон: " + damage;
    }
}
