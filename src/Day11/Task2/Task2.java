package Day11.Task2;

public class Task2 {
    public static void main(String[] args) {


        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        warrior.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(paladin);
        System.out.println(paladin);


        for (int i = 0; i < 3; i++) {
            warrior.physicalAttack(magician);
            ;
        }
        System.out.println(magician);
    }
}