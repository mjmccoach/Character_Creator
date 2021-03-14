package models.classes;
import models.Character
import models.RaceType;
import models.specialisations.DruidSpec;

public class Druid extends Character{
    private DruidSpec specialisation;

    public Druid(String name, int level, RaceType race, DruidSpec specialisation) {
        super(name, level, race);
        this.specialisation = specialisation;
    }

    public DruidSpec getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(DruidSpec specialisation) {
        this.specialisation = specialisation;
    }
}
