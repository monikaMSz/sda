package sda.code.intermediate.part4.answers.goldretrofit;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateConverts {

    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
