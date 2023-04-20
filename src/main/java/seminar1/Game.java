package seminar1;

import seminar1.Magican.Monk;
import seminar1.Shooter.Crossbowman;
import seminar1.Shooter.Sniper;
import seminar1.Units.Peasant;
import seminar1.Units.Spearman;
import seminar1.Units.Thief;

public class Game {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Wink");
        System.out.println(peasant);;

        Sniper sniper = new Sniper("Wolf");
        System.out.println(sniper);

        Crossbowman crossbowman = new Crossbowman("Dunk");
        System.out.println(crossbowman);

        Thief thief = new Thief("Alen");
        System.out.println(thief);

        Monk monk = new Monk("Eden");
        System.out.println(monk);

        Spearman spearman = new Spearman("Rock");
        System.out.println(spearman);

    }
}
