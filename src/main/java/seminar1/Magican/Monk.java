package seminar1.Magican;

public class Monk extends Magican { // монах
    public Monk(String name) {
        super(name, 20, 0.6f, 1, 2, 20);
    }

    @Override
    public String toString() {
        return name;
    }
}
