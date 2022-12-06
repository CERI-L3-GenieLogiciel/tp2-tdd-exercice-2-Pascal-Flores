public class RomanIntConvertor {

    public int RomanToInt(String romanNumber) {
        int result = 0;
        if (romanNumber.isEmpty()) {
            return 0;
        }
        else {
            char lastChar = romanNumber.charAt(0);
            for (char letter : romanNumber.toCharArray()) {
                if (convertLetterToInt(letter) == convertLetterToInt(lastChar) * 10 || convertLetterToInt(letter) == convertLetterToInt(lastChar) * 5) {
                    result += convertLetterToInt(letter) - 2 * convertLetterToInt(lastChar);
                }
                else {
                    result += convertLetterToInt(letter);
                }
            }
            return result;
        }
    }

    private static int convertLetterToInt(char romanNumber) {
        return switch (romanNumber) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid roman number");
        };
    }
}
