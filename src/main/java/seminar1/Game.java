package seminar1;

import seminar1.Magican.Monk;
import seminar1.Shooter.Crossbowman;
import seminar1.Shooter.Sniper;
import seminar1.Units.Peasant;
import seminar1.Units.Spearman;
import seminar1.Units.Thief;
import seminar1.Units.Unit;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
//        Peasant peasant = new Peasant("Wink");
//        System.out.println(peasant.getInfo());
//
//        Sniper sniper = new Sniper("Wolf");
//        System.out.println(sniper.getInfo());
//
//        Crossbowman crossbowman = new Crossbowman("Dunk");
//        System.out.println(crossbowman.getInfo());
//
//        Thief thief = new Thief("Alen");
//        System.out.println(thief.getInfo());
//
//        Monk monk = new Monk("Eden");
//        System.out.println(monk.getInfo());
//
//        Spearman spearman = new Spearman("Rock");
//        System.out.println(spearman.getInfo());

        ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Sniper(team1, getName()));
                    break;
                case 1:
                    team1.add(new Crossbowman(team1, getName()));
                    break;
                case 2:
                    team1.add(new Monk(team1, getName()));
                    break;
                case 3:
                    team1.add(new Thief(team1, getName()));
                    break;
                case 4:
                    team1.add(new Peasant(team1, getName()));
                    break;
                case 5:
                    team1.add(new Spearman(team1, getName()));
                    break;
            }
        }

        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Sniper(team2, getName()));
                    break;
                case 1:
                    team2.add(new Crossbowman(team2, getName()));
                    break;
                case 2:
                    team2.add(new Monk(team2, getName()));
                    break;
                case 3:
                    team2.add(new Thief(team2, getName()));
                    break;
                case 4:
                    team2.add(new Peasant(team2, getName()));
                    break;
                case 5:
                    team2.add(new Spearman(team2, getName()));
                    break;
            }
        }

        //team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();
        team2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();

        team2.forEach(n -> n.step());
        team2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();

        team2.sort(Unit::compareTo);
        System.out.println(team2);
    }

    // Names a = Names.values()[new Random().nextInt(Names.values().length)]; выбор случайного имени из всех значений в Enum

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
