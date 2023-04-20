package seminar1.Shooter;

public class Sniper extends Shooter{ // снайпер
    public Sniper(String name) {
        super(name, 20, 0.6f, 2, 4, 0.5f, 5, 10);
    }

    @Override
    public String toString() {
        return name;
    }
}
