package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private int damageNumber=0;
    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (damageNumber <3) {
            this.damageNumber++;
            return (this.getDamage()*3);
        }
        else {
            return this.getDamage();
        }
    }

    @Override
    public int getHitPoints() {
        return getHitPoints();
    }
}