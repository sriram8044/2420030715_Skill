import java.util.*;

class legacy{
    public static void main(String[] args){
        Date d =new Date();
        System.out.println("Current date is "+d);
        int month = d.getMonth();
        System.out.println("the month is "+month);
        int year =d.getYear();
        System.out.println(year);
        System.out.println(d.getMinutes());
        System.out.println(d.getHours());
        }
}