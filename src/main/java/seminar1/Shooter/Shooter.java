package seminar1.Shooter;

import seminar1.Units.Unit;

public class Shooter extends Unit {
     protected float accuracy;
     protected int distance, maxCountBullet, currentCountBullet;

    Shooter(String name, float hp, float luck, int speed, int damage, float accuracy, int distance, int maxCountBullet) {
        super(name, hp, luck, speed, damage);
        this.accuracy = accuracy;
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = currentCountBullet;
    }

    void shoot() {};
}
