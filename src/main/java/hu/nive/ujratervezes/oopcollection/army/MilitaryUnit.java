package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int healthPoints;
    private int damage;
    private boolean haveArmor;

    public MilitaryUnit(int healthPoints, int damage, boolean haveArmor) {
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.haveArmor = haveArmor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {

        this.damage = damage;
    }

    public boolean isHaveArmor() {
        return haveArmor;
    }

    public void setHaveArmor(boolean haveArmor) {
        this.haveArmor = haveArmor;
    }

    public int doDamage(){
        return this.damage ;
    }

    public void sufferDamage(int damage ){
        if(this.haveArmor == true){
            this.healthPoints =  this.healthPoints- (damage/2);
            this.damage +=(damage/2);
        } else{
            this.healthPoints =  this.healthPoints- damage;
            this.damage +=(damage);
        }
    }

    public abstract int getHitPoints();
}
