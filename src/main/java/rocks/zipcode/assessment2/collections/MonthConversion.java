package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer, String> month;

    public MonthConversion(Map<Integer, String> map){
        this.month = map;
    }

    public MonthConversion() {this(new HashMap<>()); }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {

            this.month.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        //throw new NullPointerException();
        return month.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        for (Integer key: this.month.keySet()){
            if (hasEntry(key, monthName)){
                return key;
            }
        }

        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return this.month.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return this.month.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.month.put(monthNumber, monthName);

    }

    public Boolean hasEntry(Integer monthNumber, String monthName) {
        //if a Key exists and if a Key contains a sequence of characters return true or false
        return this.month.containsKey(monthNumber) && this.month.get(monthNumber).contains(monthName);
    }
}
