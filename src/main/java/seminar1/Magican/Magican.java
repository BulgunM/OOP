package seminar1.Magican;

import seminar1.GameInterface;
import seminar1.Units.Unit;

public abstract class Magican extends Unit { // колдун
    protected float mana;
    Magican(String name, float hp, float luck, int speed, int damage, float mana) {
        super(name, hp, luck, speed, damage);
        this.mana = mana;
    }


    void heal() {};
}
