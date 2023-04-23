package seminar1.Magican;

import seminar1.Shooter.Shooter;
import seminar1.Units.Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magican extends Shooter { // колдун
    protected float maxMana, currentMana;

    public Magican(String name, float maxHp, float luck, int speed, int attack,
            int distance, int maxCountBullet, float accuracy, float armor, float maxMana, ArrayList<Unit> team) {
        super(name, maxHp, luck, speed, attack, distance, maxCountBullet, accuracy, armor, team);
        this.maxMana = maxMana;
        this.currentMana = maxMana;
    }

    void heal() {
    }

    void fire(){}

    void freeze() {
    }

    void addMana() {
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " mana:" + currentMana + "/" + maxMana;
    }

    @Override
    public void step() {
        if (this.currentHp > 0 && currentMana > 0) {
            for (Unit unit : team) {
                if (unit.currentHp < unit.maxHp) {
                    unit.getDamage(-attack);
                    this.currentMana--;
                    return;
                }
            }
        }
    }
}
