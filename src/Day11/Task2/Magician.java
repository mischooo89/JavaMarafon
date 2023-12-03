package Day11.Task2;

public class Magician extends Hero implements MagicAttack{
    public Magician(){
        physAtt = 5;
        magicAtt = 20;
        physDef = 0.0;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackPoints = magicAtt*(1-hero.magicDef);
        if(hero.health - attackPoints < 0){
            hero.health = 0;
        }
        hero.health -= attackPoints;
    }

    public String toString(){
        return "Magician \n" + "Здоровье: " + health;
    }
}
