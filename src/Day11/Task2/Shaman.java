package Day11.Task2;

public class Shaman extends Hero implements Healer, MagicAttack{

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + 25 > 100){
            health = 100;
        } else {
            health += 25;
        }
    }


    @Override
    public void healTeammate(Hero hero) {
        if(hero.health +30> 100){
            hero.health = 100;
        } else {
            hero.health += 30;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackPoints = magicAtt - (1-hero.magicDef);
        if(hero.health - attackPoints < 0){
            hero.health = 0;
        }
        hero.health -= attackPoints;

    }

    public String toString(){
        return "Shaman \n" + "Здоровье: " + health;
    }
}
