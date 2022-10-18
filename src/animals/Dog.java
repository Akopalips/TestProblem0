package animals;

import java.util.Random;

public class Dog extends Animal{
    private String[] breeds = new String[]{"черный", "серый", "рыжий"};

    public Dog(){
        breed = breeds[new Random().nextInt(breeds.length - 1)];
        voice();
    }

    public void voice(){
        System.out.println("гав");
    }
}