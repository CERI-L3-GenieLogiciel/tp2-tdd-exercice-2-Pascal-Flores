public class RomanIntConvertor {

    public int RomanToInt(String romanNumber) {
        if (romanNumber.isEmpty()) {
            return 0;
        }
        else {
            if (romanNumber.equals("I"))
                return 1;
            else if (romanNumber.equals("V"))
                return 5;
            else if (romanNumber.equals("X"))
                return 10;
        }
        return -1;
    }
}
