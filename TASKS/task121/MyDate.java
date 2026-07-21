package task121;
import task121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1,01,1978);
        DateTask date2 = new DateTask(9,21,1984);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
       // display leapyears
        DateTask.leapYears();
    }
}