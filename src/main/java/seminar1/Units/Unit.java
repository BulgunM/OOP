package seminar1.Units;

public class Unit {

    protected String name;
    protected float hp, luck; // количество жизней
    protected int speed, damage;

    public Unit(String name, float hp, float luck, int speed, int damage) {
        this.name = name;
        this.hp = hp;
        this.luck = luck;
        this.speed = speed;
        this.damage = damage;
    }

    void attack() {};
    void waiting() {};
    void defend() {};
    void move() {};
    void dead() {};
}
