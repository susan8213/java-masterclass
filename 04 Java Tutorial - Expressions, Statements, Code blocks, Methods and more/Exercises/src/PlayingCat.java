public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int low = 25;
        int high = summer ? 45 : 35;

        return temperature >= low && temperature <= high;
    }
}
