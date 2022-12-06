public class RomanIntConvertor {

    public int RomanToInt(String romanNumber) {
        if (romanNumber.isEmpty()) {
            return 0;
        }
        else {
            return switch (romanNumber) {
                case "I" -> 1;
                case "V" -> 5;
                case "X" -> 10;
                case "L" -> 50;
                case "C" -> 100;
                default -> -1;
            };
        }
    }
}
