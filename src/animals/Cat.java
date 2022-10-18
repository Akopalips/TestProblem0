package animals;

import java.util.Random;

public class Cat extends Animal{
    private String[] breeds = new String[]{"синий", "красный", "зеленый"};

    public Cat(){
        breed = breeds[new Random().nextInt(breeds.length - 1)];
        voice();
    }

    public void voice(){
        System.out.println("мяу");
    }
}