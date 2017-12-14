package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitPoints;
    private String name;

    public Troll() {
        this.name = "Troll";
        hitPoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints = hitPoints - (amount / 2);
    }

    @Override
    public void reportStatus() {
        System.out.printf("Name: %-7s Current Hit Points: %d%n", name, hitPoints);
    }
}
