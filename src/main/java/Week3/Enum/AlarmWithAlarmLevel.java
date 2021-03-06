package Week3.Enum;


public class AlarmWithAlarmLevel {
    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht ├╝berschritten";

    public static String checkNumberOfCustomers(int numberOfCustomers, AlarmEnum alarmLevel) {
        return alarmLevel.alarmCustomers(numberOfCustomers);
    }
}