package models.classes;
import models.Character;
import models.RaceType;
import models.specialisations.HunterSpec;

public class Hunter extends Character {

    private HunterSpec specialisation;

    public Hunter(String name, int level, RaceType race, HunterSpec specialisation) {
        super(name, level, race);
        this.specialisation = specialisation;
    }

    public HunterSpec getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(HunterSpec specialisation) {
        this.specialisation = specialisation;
    }
}
