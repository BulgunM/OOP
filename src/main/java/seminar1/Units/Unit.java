package seminar1.Units;

import seminar1.GameInterface;

public abstract class Unit implements GameInterface {

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
