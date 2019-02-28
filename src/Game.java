import java.util.Random;

public class Game {

    private void setCar(Door[] doors) {
        Random random = new Random();
        int number = random.nextInt(3);
        doors[number].setCar();
    }

    private int openWithNoChange(Door[] doors) {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (doors[choice].isCar) return 1;
        else return 0;
    }

    private int openWithChange(Door[] doors) {
        Random random = new Random();
        int choice = random.nextInt(3);
        if(!doors[choice].isCar) return 1;
        else return 0;
    }

    public int noChangeCounter = 0;
    public int changeCounter = 0;

    public void cycle() {
        Door[] doors = new Door[3];
        for (int i = 0; i < 3; i++) {
            doors[i] = new Door();
        }
        setCar(doors);
        changeCounter += openWithChange(doors);
        noChangeCounter += openWithNoChange(doors);
    }


}
