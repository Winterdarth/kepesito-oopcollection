package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    int damageNumber = 0;

    public Swordsman(boolean isArmed) {
        super(100, 10, isArmed);
    }

    @Override
    public void sufferDamage(int damage) {

        if(damageNumber == 0) {
            super.sufferDamage(0);
            this.damageNumber++;
        }
        else {
            super.sufferDamage(damage);
        }
    }

    @Override
    public int getHitPoints() {
        return getHitPoints();
    }
}