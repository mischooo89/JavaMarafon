package Day11.Task2;

public class Paladin extends Hero implements Healer{
    public Paladin () {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;

    }

    public void healHimself(){
        if (health + 25 > 100){
            health = 100;
        } else {
            health += 25;
        }
    }


    public void healTeammate(Hero hero){
        if(hero.health + 10 > 100) {
            health = 100;
        } else {
            hero.health += 10;
        }
    }

    public String toString(){
        return "Паладин \n" + "Здоровье: " + health;
    }

}
