package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) throws IllegalArgumentException {
        ArrayList<String> subArray = new ArrayList<>();

        try {
            for (int i = startingIndex; i < endingIndex; i++){
                subArray.add(arrayToBeSpliced[i]);
            }

            //need to review try catch and exeptions
            if (startingIndex < 0) throw new IllegalArgumentException();

        } catch(IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        } catch(Exception e) {
            throw new IllegalArgumentException();
        }

        String[] newArr = new  String[subArray.size()];
        newArr = subArray.toArray(newArr);
        return newArr;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        ArrayList<String> endingArray = new ArrayList<>();

        try {
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++){
                endingArray.add(arrayToBeSpliced[i]);
            }
            //review try catch and exceptions
            //not sure why the last catch statement is not working need to review
            if (startingIndex > arrayToBeSpliced.length) throw new IllegalArgumentException();
        } catch(IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }

        String[] newArr = new  String[endingArray.size()];
        newArr = endingArray.toArray(newArr);
        return newArr;
    }
}
