
package edu.wctc.advjava.njr.datetime;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * This class is Date Utilities, which is used for calculating basic time and date methods,
 * along with methods displaying current local times and dates.
 * 
 * @author nrieck
 * @version 1.00
 * @since 1.8
 */
public class DateUtilities {
    
    private DateUtilities() {      
    }
    
    /** Returns the local Date and Tim
     * @return local date and time */
    public final LocalDateTime nowLocalDateTime() {
        return LocalDateTime.now();
    }
    
    /** Returns the local date 
     *  @return  local date */
    public final LocalDate nowLocalDate() {
        return LocalDate.now();
    }
    
    /** Returns the local time army time
     *  @return  local army time*/
    public final LocalTime nowLocalArmyTime() {
        return LocalTime.now();
    }
    
    /** Returns the local time and date formatted in mm/dd/yyyy
     *  @return  local date and time formatted*/
    public final String nowLocalFormatted() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
        String strDate = date.format(format);
        return strDate;
    }
    
    /**
     * Returns the amount of days in between the inputed start date and end date.
     * @param startDate Start date to calculate days in between
     * @param endDate End date for days in between
     * @return days calculated in between two dates
     * @throws IllegalArgumentException if start date or end date is null
     */
    public final long findDaysInBetween(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start date or endDate null");
        }
        Duration difference = Duration.between(startDate, endDate);
        long daysCalc = difference.toDays();
        return daysCalc;
    }
    
    /**
     * Finds duration in between two given days. 
     * @param startDate start date for calculation
     * @param endDate end date for calculation
     * @return difference in between the two dates
     * @throws IllegalArgumentException if start date or end date is null
     */
    public final Duration findDurationBetweenDates(LocalDateTime startDate, LocalDateTime endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start date or endDate null");
        }
        Duration difference = Duration.between(startDate, endDate);
        return difference;
    }
    
}
