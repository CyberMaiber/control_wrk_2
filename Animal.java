package control_wrk_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

abstract class Animal {
    String name;
    Date birthDay;
    
    //abstract Animal creater (Animal anml);
    
    public static Date parseDate(String strDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
        Date date;
        date = (Date) formatter.parse(strDate);
        return date;
    }
}

