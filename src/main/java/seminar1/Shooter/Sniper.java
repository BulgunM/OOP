package seminar1.Shooter;

public class Sniper extends Shooter{ // снайпер
    public Sniper(String name) {
        super(name, 20, 0.6f, 2, 4, 0.5f, 5, 10);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "имя: " + name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " урон: " + damage +
                " точность: " + accuracy + " дистанция: " + distance + " максимальное количество пуль: " + maxCountBullet;
    }
}
