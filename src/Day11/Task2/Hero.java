package Day11.Task2;

public abstract class Hero implements PhysAttack {

     int physAtt;
    double magicAtt;
    double physDef;
    double magicDef;
     int health;

    public Hero() {
        this.health = 100;
    }

    public void physicalAttack (Hero h) {
        double attackPoints = physAtt*(1-h.physDef);
        if(h.health - attackPoints < 0) {
            h.health = 0;
        } else {
            h.health -= attackPoints;
        }
    }


}

