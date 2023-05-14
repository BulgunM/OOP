package seminar1.Units;

import seminar1.GameInterface;

import java.util.ArrayList;

public abstract class Unit implements GameInterface {
    public String name;
    public float maxHp;
    public float currentHp;
    protected float luck;
    protected float armor;
    protected int attack;
    public int speed;
    protected ArrayList<Unit> team;
    public Coordinate coordinate;

    public Unit(String name, float maxHp, float luck, int speed, int attack, float armor, ArrayList<Unit> team, int x, int y){
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.luck = luck;
        this.speed =speed;
        this.attack = attack;
        this.armor = armor;
        this.team = team;
        this.coordinate = new Coordinate(x, y);
    }

    void attack(Unit target){
        target.getDamage(attack);
    }
    void await(){
    }
    void defend(){
    }

    public boolean die(){
        if (currentHp <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void getDamage(float damage){
        this.currentHp -= damage;
        if (this.currentHp > this.maxHp) {
            this.currentHp = this.maxHp;
        }
        if (this.currentHp < 0) {
            this.currentHp = 0;
        }
    }

    @Override
    public String getInfo() {
        return "[" + name + " " + toString() + "] hp:" +
                currentHp + "/" + maxHp + " luck:" + luck
                + " speed:" + speed + " attack:" + attack
                + " armor:" + armor;
    }

    @Override
    public void step(ArrayList<Unit> enemy) {
        System.out.println(getClass().getName());
    }


}


