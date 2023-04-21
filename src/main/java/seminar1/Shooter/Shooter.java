package seminar1.Shooter;

import seminar1.GameInterface;
import seminar1.Units.Unit;

public abstract class Shooter extends Unit implements GameInterface {
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
