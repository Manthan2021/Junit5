package testcode;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import buisnesscode.ScheduleService;

class ScheduleServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}
//assuming current timezoneis IST
	@Test
	void testDoSchedule() {
		TimeZone tzone=TimeZone.getDefault();
		assumeTrue(tzone.getDisplayName().equals("Indian Standard Time"));
		//doschedule method
		ScheduleService ss=new ScheduleService();
		assertTrue(ss.doSchedule());
	}

	/*
	 * @Test void testBackupCalendar() { fail("Not yet implemented"); }
	 * 
	 }*/
	@Test
	public void doScheduleLocaleNonUS() {
	// Assume that the current locale is India
	Locale currentLocale = Locale.getDefault();
	assumeFalse(currentLocale.equals(Locale.US));
	// Test doSchedule method
	ScheduleService scheduleService = new ScheduleService();
	assertTrue(scheduleService.doSchedule());
	}
	@Test void testBackupCalendar() {
		assumeTrue(System.getProperty("os.name").startsWith("Windows"));
		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.backupCalendar());
		
		}
}
