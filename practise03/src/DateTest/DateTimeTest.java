package DateTest;

import org.junit.Test;

import java.util.Calendar;

/**
 * @author LiuJun
 * @create 2021-9-19-23:12
 */
public class DateTimeTest {
    @Test
    public void testCalendar(){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getClass());

    }
//    public void testExr() throw ParseException{
//        String birth="2020-09-08";
//
//        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-mm-dd");
//        Date date = sdf1.parse(birth);
//
//
//
//
//        java.sql.Date birthdate=new java.sql.Date(date.getTime());
//    }
//class




}
