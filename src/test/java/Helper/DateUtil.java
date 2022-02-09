package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtil {



    public static String getCurrentDateDate(){
        Date currentDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("d");
        String currentDateDate=sdf.format(currentDate);
        System.out.println("the currentDateDate is :"+currentDateDate);
        return currentDateDate;
    }

    public static String getCurrentDateMonth(){
        Date currentDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("MMM");
        String currentDateMonth=sdf.format(currentDate);
        System.out.println("the currentDateMonth is :"+currentDateMonth);
        return currentDateMonth;
    }

    public static String getCurrentDateYear(){
        Date currentDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        String currentDateYear=sdf.format(currentDate);
        System.out.println("the currentDateYear is :"+currentDateYear);
        return currentDateYear;
    }

    public static Date getCurrentDate(){
        Date currentDate=new Date();
        return currentDate;
    }

    public static Date getTomorrowDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    public static String[] addDaysToToday(int addDays) {
        Calendar cal = Calendar.getInstance();
        Date currentDate=new Date();
        Date dateToday = currentDate;
        cal = Calendar.getInstance();
        cal.setTime(dateToday);
        cal.add(Calendar.DAY_OF_MONTH, addDays);
        Date tomorrowPlusDays1 = cal.getTime();
        SimpleDateFormat df1 = new SimpleDateFormat("d MMMM yyyy");
        String[] news= df1.format(tomorrowPlusDays1).split(" ");
        return df1.format(tomorrowPlusDays1).split(" ");
        // [15, January, 2022]
    }

    public static String[] getTomorrowDateFields() {
        Date dateTomorrow = getTomorrowDate();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        return df.format(dateTomorrow).split(" ");
        // [8, January, 2022]
    }

    public static String[] addDaysToTomorrow(int addDays) {
        Date dateTomorrow = getTomorrowDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateTomorrow);
        cal.add(Calendar.DAY_OF_MONTH, addDays);
        Date tomorrowPlusDays = cal.getTime();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        return df.format(tomorrowPlusDays).split(" ");
        // [15, January, 2022]
    }

    public static boolean isDateInCorrectFormat(String dateText, String expDateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(expDateFormat);
        boolean isDateFormatCorrect = true;

        try {
            sdf.parse(dateText);
        } catch (ParseException e) {
            isDateFormatCorrect = false;
        }

        return isDateFormatCorrect;
    }



    public static List<String> textDateToDateFormat(List dateText, String expDateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(expDateFormat);
        boolean isDateFormatCorrect = true;
        List<String> newList = dateText;
        List<String> dateList = new ArrayList<String>();
        System.out.println("The datetext values in List  are : " + newList);
        try {
            for (String dateValue : newList) {
                dateList.add(sdf.format(sdf.parse(dateValue)));
            }
            System.out.println("The datetext after date conversion and format are :" + dateList);
        } catch (ParseException e) {
            isDateFormatCorrect = false;
        }
return dateList;
    }}









