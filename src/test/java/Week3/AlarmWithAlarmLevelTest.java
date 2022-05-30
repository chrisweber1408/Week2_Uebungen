package Week3;

import org.junit.jupiter.api.Test;
import Week3.AlarmWithAlarmLevel;

import static org.junit.jupiter.api.Assertions.*;

class AlarmWithAlarmLevelTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(15, AlarmEnum.GELB));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(30, AlarmEnum.GELB));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", AlarmWithAlarmLevel.checkNumberOfCustomers(31, AlarmEnum.GELB));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(45, AlarmEnum.GRÜN));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(60, AlarmEnum.GRÜN));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", AlarmWithAlarmLevel.checkNumberOfCustomers(61, AlarmEnum.GRÜN));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", AlarmWithAlarmLevel.checkNumberOfCustomers(1, AlarmEnum.ROT));
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(0, AlarmEnum.ROT));
    }
}