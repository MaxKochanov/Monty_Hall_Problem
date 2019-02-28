public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        for(int i = 0; i < 10000; i++){
            game.cycle();
        }
        System.out.println("With no change " + game.noChangeCounter);
        System.out.println("With change " + game.changeCounter);
    }

}
