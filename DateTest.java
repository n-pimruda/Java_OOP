public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("The initial date is: ");
        date1.displayDate();

        date1.setDay(11);
        date1.setMonth(1);
        date1.setYear(2003);
        System.out.println("Date with new values is: ");
        date1.displayDate();
    }
}
