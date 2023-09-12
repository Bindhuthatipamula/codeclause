/*
Task 1:- Time Conversion by Country
------


Code:-
-------
*/

import java.util.*;
import java.text.*;

public class TimeConversion {

    public static void main(String[] args) {
        // Get the current time in India.
        long indiaTime = System.currentTimeMillis();

        // Create TimeZone objects for the 10 countries.
        TimeZone[] timeZones = {
            TimeZone.getTimeZone("EST"),
            TimeZone.getTimeZone("PST"),
            TimeZone.getTimeZone("GMT"),
            TimeZone.getTimeZone("CET"),
            TimeZone.getTimeZone("CEST"),
            TimeZone.getTimeZone("MSK"),
            TimeZone.getTimeZone("AEDT"),
            TimeZone.getTimeZone("NZDT"),
            TimeZone.getTimeZone("IST"),
            TimeZone.getTimeZone("JST")
        };

        // Get the offsets between India time zone and the 10 time zones.
        int[] offsets = new int[10];
        for (int i = 0; i < 10; i++) {
            offsets[i] = timeZones[i].getOffset(indiaTime);
        }

        // Add the offsets to the current time to get the time in the 10 countries.
        long[] convertedTimes = new long[10];
        for (int i = 0; i < 10; i++) {
            convertedTimes[i] = indiaTime + offsets[i];
        }

        // Create SimpleDateFormat objects for the 10 time zones.
        SimpleDateFormat[] sdf = new SimpleDateFormat[10];
        for (int i = 0; i < 10; i++) {
            sdf[i] = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            sdf[i].setTimeZone(timeZones[i]);
        }

        // Format the time in the 10 countries.
        String[] convertedTimesStr = new String[10];
        for (int i = 0; i < 10; i++) {
            convertedTimesStr[i] = sdf[i].format(new Date(convertedTimes[i]));
        }

        // Print the time in the 10 countries.
        for (int i = 0; i < 10; i++) {
            System.out.println("The time in " + timeZones[i].getDisplayName() + " is " + convertedTimesStr[i]);
        }
    }
}
/*
 * Output 1:-

The time in Eastern Standard Time is 09/08/2023 07:59:50
The time in Pacific Standard Time is 09/08/2023 03:59:50
The time in Greenwich Mean Time is 09/08/2023 17:59:50
The time in Central European Time is 09/08/2023 21:59:50
The time in Greenwich Mean Time is 09/08/2023 17:59:50
The time in Greenwich Mean Time is 09/08/2023 17:59:50
The time in Greenwich Mean Time is 09/08/2023 17:59:50
The time in Greenwich Mean Time is 09/08/2023 17:59:50
The time in India Standard Time is 09/09/2023 04:59:50
The time in Japan Standard Time is 09/09/2023 11:59:50

*Output 2(After few hours):-

The time in Eastern Standard Time is 09/09/2023 12:54:49
The time in Pacific Standard Time is 09/09/2023 08:54:49
The time in Greenwich Mean Time is 09/09/2023 22:54:49
The time in Central European Time is 09/10/2023 02:54:49
The time in Greenwich Mean Time is 09/09/2023 22:54:49
The time in Greenwich Mean Time is 09/09/2023 22:54:49
The time in Greenwich Mean Time is 09/09/2023 22:54:49
The time in Greenwich Mean Time is 09/09/2023 22:54:49
The time in India Standard Time is 09/10/2023 09:54:49
The time in Japan Standard Time is 09/10/2023 16:54:49



----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */