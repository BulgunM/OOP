package seminar1.Units;

import seminar1.GameInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Unit implements GameInterface, Comparable {
protected int initiative;
    protected String name;
    public int health;
    public int maxHealth;
    protected int armor;
    protected int[] damage;
    protected ArrayList<Unit> team;
    protected static Random random;

    static {
        Unit.random = new Random();
    }
    public Unit(int initiative, ArrayList<Unit> team, String name, int health, int armor, int[] damage) {
        this.initiative = initiative;
        this.team = team;
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        if (new Random().nextBoolean()) this.health -= 9;
        this.armor = armor;
        this.damage = damage;
    }

    public String getInfo() {
        return String.format("Name: %s  Health: %d  Type: %s  Damage: %s  Armor: %d  %d Init",
        this.name, this.health, this.getClass().getSimpleName(), Arrays.toString(this.damage), this.armor, this.initiative);
    }

    public void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp + this.health;
    }

    public void getDamage(int doneDamage) {
        doneDamage = (int) (doneDamage * ((100 - this.armor) / 100));
        if ((this.health - doneDamage) > 0) {
            this.health -= doneDamage;
        }
    }

    public void attack(Unit target) {
        target.getDamage(new Random().nextInt(this.damage[0],this.damage[1]));
    }

    public String toString() {
        return  this.getClass().getSimpleName();
    }

    public abstract void step();

    public int compareTo(Object o) {
        Unit unit = (Unit) o;
        return unit.initiative - this.initiative;
    }
}


