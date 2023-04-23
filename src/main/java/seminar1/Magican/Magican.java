package seminar1.Magican;

import seminar1.Units.Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magican extends Unit { // колдун
    protected int mana, maxMana, accuracy;

    public Magican(int init, ArrayList<Unit> team, String name, int health, int armor, int[] damage, int mana, int accuracy) {
        super(init, team, name, health, armor, damage);
        this.mana = mana;
        this.maxMana = maxMana;
        this.accuracy = accuracy;
    }

    public void heal(Unit target) {
        target.healed(new Random().nextInt(this.damage[0]));
    }

    public void attack(Unit target) {
        target.getDamage(new Random().nextInt(this.damage[0]));
    }



    @Override
    public void step() {
        if (mana < 1) {
            System.out.println("Нет маны");
            return;
        }
        int index_damaged = 0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i + 1; j < team.size() - 1; j++) {
                if (team.get(i).health != 0 || team.get(j).health != 0) {
                    if (team.get(i).health / team.get(i).maxHealth < team.get(j).health / team.get(j).maxHealth) {
                        index_damaged = i;
                    }
                }
            }
        }
        team.get(index_damaged).healed(new Random().nextInt(this.damage[0]));
        this.mana -= 1;
    }


}
