package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import animals.*;

public class Main{

    public static void main(String [] args){
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Random random = new Random();
        int catsCount = random.nextInt(10);
        int dogsCount = random.nextInt(10);

        for (int i = 0; i < catsCount; i++){
            cats.add(new Cat());
        }
        for (int i = 0; i < dogsCount; i++){
            dogs.add(new Dog());
        }

        System.out.printf("Создал%s %d кош%s (", catsCount == 1 ? "ась" : "ось", catsCount, catsCount == 1 ? "ка" : (catsCount < 5 ? "ки" : "ек"));
        System.out.println(cats.stream()
                .map(Cat::getBreed)
                .collect(Collectors.joining(", ")).toString() + ')');
        System.out.printf("Создал%s %d собак%s (", dogsCount == 1 ? "ась" : "ось", dogsCount, dogsCount == 1 ? "а" : (dogsCount < 5 ? "и" : ""));
        System.out.println(dogs.stream()
                .map(Dog::getBreed)
                .collect(Collectors.joining(", ")).toString() + ')');
        System.out.println("Итог: выиграли " + (dogsCount > catsCount ? "собаки" : "коты") + '.');
    }
}