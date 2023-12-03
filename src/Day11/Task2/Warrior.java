package Day11.Task2;

public class Warrior extends Hero{

    public Warrior(){
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0.0;
    }

public String toString(){
        return "Warrior \n" + "Здоровье: " + health;
   }
}
