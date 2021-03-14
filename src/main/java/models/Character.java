package models;

public abstract class Character {

    private String name;
    private int level;
    private RaceType race;

    public Character(String name, int level, RaceType race) {
        this.name = name;
        this.level = level;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = race;
    }
}
