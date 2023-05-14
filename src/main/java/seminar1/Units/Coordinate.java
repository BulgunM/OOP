package seminar1.Units;

public class Coordinate {
    public int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getDistance(Coordinate enemyCoordinate) {
        float dx = enemyCoordinate.x - this.x;
        float dy = enemyCoordinate.y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
