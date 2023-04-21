package seminar1.Magican;

public class Monk extends Magican { // монах
    public Monk(String name) {
        super(name, 20, 0.6f, 1, 2, 20);
    }

    @Override
    public String toString() {
        return "Монах";
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "имя: " + name + " здоровье: " + hp + " удача: " + luck +
                " скорость: " + speed + " урон: " + damage + " мана: " + mana;
    }
}
