public class Lasagna {

    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int TIME_PER_LAYER = 2;

        public int expectedMinutesInOven() {
            return EXPECTED_MINUTES_IN_OVEN;
        }
    
        public int remainingMinutesInOven(int minutesInOven) {
            return EXPECTED_MINUTES_IN_OVEN - minutesInOven;
        }
    
        public int preparationTimeInMinutes(int layers) {
            return layers * TIME_PER_LAYER;
        }

        public int totalTimeInMinutes(int layers, int minutesInOven) {
            return preparationTimeInMinutes(layers) + minutesInOven;
        }
}
