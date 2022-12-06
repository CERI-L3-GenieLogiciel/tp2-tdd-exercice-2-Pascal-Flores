import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class RomanIntConvertor {

    ////////////
    // public //
    ////////////
    public int RomanToInt(String romanNumber) {
        int result = 0;
        if (romanNumber.isEmpty()) {
            return 0;
        }
        else {
            if (Pattern.matches("([IVXLC]){4,}", romanNumber))
                throw new IllegalArgumentException("Invalid Roman Number");

            char lastChar = romanNumber.charAt(0);
            for (char letter : romanNumber.toCharArray()) {
                if (convertLetterToInt(letter) == convertLetterToInt(lastChar) * 10 || convertLetterToInt(letter) == convertLetterToInt(lastChar) * 5) {
                    result += convertLetterToInt(letter) - 2 * convertLetterToInt(lastChar);
                }
                else {
                    result += convertLetterToInt(letter);
                }
                lastChar = letter;
            }
            return result;
        }
    }

    public String IntToRoman(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Invalid Number");
        else if (number == 0)
            return "";
        else {
            String result = "";
            ArrayList<Integer> numberList = new ArrayList<>();
            while (number > 0) {
                numberList.add(number % 10);
                number /= 10;
            }
            Collections.reverse(numberList);
            for (int i = 0; i < numberList.size(); i++) {
                String temp = "";
                if (numberList.get(i) == 4) {
                    temp =  String.valueOf(convertIntToLetter((int) Math.pow(10, numberList.size() - i - 1)))
                            + String.valueOf(convertIntToLetter((int) Math.pow(10, numberList.size() - i -1)*5));
                }
                else if (numberList.get(i) == 5)
                    result += convertIntToLetter(5 * (int) Math.pow(10, numberList.size() - 1 - i));
                else
                    for (int j = 0; j < numberList.get(i); j++) {
                        result += convertIntToLetter((int) Math.pow(10, numberList.size() - 1 - i));
                    }
                result += temp;
            }
            return result;
        }
    }


    /////////////
    // private //
    /////////////
    private char convertIntToLetter(int number) {
        return switch (number) {
            case 1 -> 'I';
            case 5 ->  'V';
            case 10 -> 'X';
            case 50 -> 'L';
            case 100 -> 'C';
            case 500 -> 'D';
            case 1000 -> 'M';
            default -> throw new IllegalArgumentException("Invalid Number");
        };
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
