package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    //https://www.geeksforgeeks.org/how-to-pad-a-string-in-java/
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        //https://www.geeksforgeeks.org/how-to-pad-a-string-in-java/
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    //https://www.geeksforgeeks.org/how-to-pad-a-string-in-java/
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        //https://www.geeksforgeeks.org/how-to-pad-a-string-in-java/
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        while (counter < numberOfTimeToRepeat){
            sb.append(stringToBeRepeated);
            counter++;
        }

        return String.valueOf(sb);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        //https://www.geeksforgeeks.org/java-program-to-check-whether-the-string-consists-of-special-characters/
        //https://www.tutorialkart.com/java/how-to-check-if-string-contains-only-alphabets-in-java/#gsc.tab=0
        return string.matches("[a-zA-Z ]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        //https://www.geeksforgeeks.org/java-program-to-check-whether-the-string-consists-of-special-characters/
        //https://www.tutorialkart.com/java/how-to-check-if-string-contains-only-alphabets-in-java/#gsc.tab=0
        return string.matches("[0-9 ]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        //https://www.geeksforgeeks.org/java-program-to-check-whether-the-string-consists-of-special-characters/
        //https://www.tutorialkart.com/java/how-to-check-if-string-contains-only-alphabets-in-java/#gsc.tab=0
        return string.matches("[^0-9 ]+");
    }
}
