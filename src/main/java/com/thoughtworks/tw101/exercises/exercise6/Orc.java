package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int hitPoints;
    private String name;

    public Orc() {
        this.name = "Orc";
        hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints = hitPoints - amount;
    }

    @Override
    public void reportStatus() {
        System.out.printf("Name: %-7s Current Hit Points: %d%n", name, hitPoints);
    }
}
