package Day7.Futbol;

import java.sql.SQLOutput;
import java.util.Random;

public class Player {
    int stamina;

    public static int MAX_STAMINA = 100;
    public static int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player(int stamina){
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6){
            countPlayers = 6;
        }
    }


    public int getStamina (){
        return this.stamina;
    }

    public static int getCountPlayers(){
        return countPlayers;
    }

    public void run() {
        this.stamina -= 1;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок покидает поле" + " Выносливость: " + stamina);
        }else if (stamina<0) {
            stamina = 0;
            System.out.println("Игрок не может играть");
        }else{
            System.out.println("Игрок ещё может играть" + " Выносливость: " + stamina);
        }
    }

      public void info () {
          for (int i = 0; i < countPlayers; i++) {
              int freePlaces = countPlayers-i;
              if (countPlayers < 6) {
                  System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных мест");
                  if(freePlaces == 1) {
                      System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободное место");
                  }
              } else {
                  System.out.println("На поле нет свободных мест");
              }
          }

      }

    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt((MAX_STAMINA-90)+1)+90);
        Player player2 = new Player(random.nextInt((MAX_STAMINA-90)+1)+90);
        Player player3 = new Player(random.nextInt((MAX_STAMINA-90)+1)+90);
        Player player4 = new Player(random.nextInt((MAX_STAMINA-90)+1)+90);
        Player player5 = new Player(random.nextInt((MAX_STAMINA-90)+1)+90);
        Player player6 = new Player(random.nextInt((MAX_STAMINA-90)+1)+90);
        Player player7 = new Player(2);

        player1.info();
        player7.run();
        player7.run();
        player7.run();



    }
}

