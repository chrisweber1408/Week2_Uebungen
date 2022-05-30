package Week3.Enum;

public enum AlarmEnum {

    ROT(0),
    GELB(30),
    GRÜN(60);

    private final int maxCustomers;

    AlarmEnum(int maxCustomers){
        this.maxCustomers = maxCustomers;
    }

    public String alarmCustomers(int customers){
        if (customers > maxCustomers){
            return "Zu viele Personen";
        }
        return "Maximale Personenzahl nicht überschritten";
    }
}
