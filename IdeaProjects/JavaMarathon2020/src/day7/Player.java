package day7;

public class Player {
        private int stamina;
        private final static int MIN_STAMINA = 0;
        private final static int MAX_STAMINA = 100;
        private static int countPlayer;



    public Player(int stamina) {
         this.stamina = stamina;

        if (countPlayer < 6){
            countPlayer ++;
        }
    }

    public void run(){
        if (stamina == 0)
            return;
        stamina--;

        if (stamina == 0)
            countPlayer--;
    }

    public static void info () {
        if (countPlayer<6)
        switch (countPlayer){
            case 1 :
            case 2 :
                System.out.println("Команды неполные, еще есть " + (6 - countPlayer) + " свободных мест"); break;
            case 3 :
            case 4 :
                System.out.println("Команды неполные, еще есть " + (6 - countPlayer) + " свободных места"); break;
            case 5 : System.out.println("Команды неполные, еще есть " + (6 - countPlayer) + " свободное место"); break;
        }
        else
            System.out.println("Мест в командах больше нет");
    }

}
