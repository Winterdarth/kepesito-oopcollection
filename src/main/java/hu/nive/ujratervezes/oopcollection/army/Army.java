package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army  {

    public static List<MilitaryUnit> army = new ArrayList<>();
    public static void	addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }
    public static void damageAll(int damage){

        for(int i = 0; i < army.size(); i++){
            army.get(i).sufferDamage(damage);
        }

        for(int i=0; i<army.size(); i++){
            if(army.get(i).getHealthPoints() < 25){
                army.remove(i);
            }
        }
    }

    public int getArmyDamage(){
        int totalDamage=0;
        for (int i = 0; i < army.size(); i++){
            totalDamage = totalDamage + army.get(i).getDamage();
        }
        return totalDamage;
    }

    public int getArmySize() {
        return army.size();
    }
}