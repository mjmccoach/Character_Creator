package models.classes;
import models.Character;
import models.RaceType;
import models.specialisations.MageSpec;

public class Mage extends Character{
    private MageSpec specialisation;

    public Mage(String name, int level, RaceType race, MageSpec specialisation) {
        super(name, level, race);
        this.specialisation = specialisation;
    }

    public MageSpec getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(MageSpec specialisation) {
        this.specialisation = specialisation;
    }
}
