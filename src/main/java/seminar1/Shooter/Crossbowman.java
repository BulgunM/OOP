package seminar1.Shooter;

import seminar1.Shooter.Shooter;

public class Crossbowman extends Shooter { // арбалетчик

    public Crossbowman(String name) {
        super(name, 20, 0.5f, 2, 2, 0.5f, 2, 50);
    }

    @Override
    public String toString() {
        return name;
    }
}

