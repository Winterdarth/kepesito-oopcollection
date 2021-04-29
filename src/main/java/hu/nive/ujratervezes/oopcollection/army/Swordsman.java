package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    int damageNmber=0;

    public Swordsman(boolean isArmed) {
        super(100, 10, isArmed);
    }

    @Override
    public void sufferDamage(int damage) {

        if(damageNmber ==0) {
            super.sufferDamage(0);
            this.damageNmber++;
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