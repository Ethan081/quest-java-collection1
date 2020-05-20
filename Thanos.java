import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
            ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
            // name: Black Widow, age: 34
            Hero blackWidow = new Hero("Black Widow", 34);
            heroes.add(blackWidow);

            // name: Captain America, age: 100
            Hero captainAmerica = new Hero("Captain America,", 100);
            heroes.add(captainAmerica);

            // name: Vision, age: 3
            Hero vision = new Hero("Vision", 3);
            heroes.add(vision);

            // name: Iron Man, age: 48
            Hero ironMan = new Hero("Iron Man", 48);
            heroes.add(ironMan);

            // name: Scarlet Witch, age: 29
            Hero scarletWitch = new Hero("Scarlet Witch,", 48);
            heroes.add(scarletWitch);

            // name: Thor, age: 1500
            Hero thor = new Hero("Thor", 48);
            heroes.add(thor);

            // name: Hulk, age: 49
            Hero hulk = new Hero("Hulk", 48);
            heroes.add(hulk);

            // name: Doctor Strange, age: 42
            Hero doctorStrange = new Hero("Doctor Strange", 48);
            heroes.add(doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
            Hero changeThorAge = heroes.get(5);
            changeThorAge.setAge(1501);

        // TODO 4 : Shuffle the heroes list
            Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
            int halfHeroSize = heroes.size()/2;
            List<Hero> heroes2 = heroes.subList(0,halfHeroSize);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero heroesALive : heroes2) {
            System.out.println(heroesALive.getName());

        }
    }
}
