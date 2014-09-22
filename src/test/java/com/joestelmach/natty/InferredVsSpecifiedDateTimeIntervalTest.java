package com.joestelmach.natty;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class InferredVsSpecifiedDateTimeIntervalTest extends AbstractTest {

  enum DateInterval {
    YEAR, MONTH, DAY, HOUR
  }

  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }

  @Test
  public void testFormal() {
    validateSpecified("1978-01-28", DateInterval.YEAR);
  }

  @Test
  public void testVariousYear() {
    /*
 last year
 this year
 next year
 10 years ago
 in 5 years
 last june
 2 years before now
 4 years from now
 tomorrow 1 year ago
 11 january 2 years ago

     */
    /* //year with other things
 last wednesday 7am
 this wednesday 7am
 next wednesday 7am
 last wednesday 7pm
 this wednesday 7pm
 next wednesday 7pm
 last tuesday 11 am
 this tuesday 11 am
 next tuesday 11 am
 last tuesday 11 pm
 this tuesday 11 pm
 next tuesday 11 pm
 yesterday at 13:00
 1999-12-31 to tomorrow
 now to 2010-01-01
 2009-03-10 9:00 to 11:00
 26 oct 10:00 am to 11:00 am
 jan 24, 2011 12:00
 jan 24, 2011 12am
 jan 24, 2011 12pm

     */
    validateSpecified("last year", DateInterval.YEAR);
    validateSpecified("this year", DateInterval.YEAR);
    validateSpecified("next year", DateInterval.YEAR);
    validateSpecified("10 years ago", DateInterval.YEAR);
    validateSpecified("in 5 years", DateInterval.YEAR); //, DateInterval.MONTH, DateInterval.DAY);
    validateSpecified("last years from now", DateInterval.YEAR);
    validateSpecified("2 years before now", DateInterval.YEAR);
    validateSpecified("4 years from now", DateInterval.YEAR);

    //validateSpecified("last june", DateInterval.YEAR);
//    validateSpecified("tomorrow 1 year ago", DateInterval.YEAR); //, DateInterval.MONTH, DateInterval.DAY);
    //validateSpecified("11 january 2 years ago", DateInterval.YEAR); //, DateInterval.MONTH, DateInterval.DAY);
    validateSpecified("2 years from today", DateInterval.YEAR); //, DateInterval.MONTH, DateInterval.DAY);

    //negatives
    validateNotSpecified("last year", DateInterval.MONTH, DateInterval.DAY, DateInterval.HOUR);
    validateNotSpecified("this year", DateInterval.MONTH, DateInterval.DAY, DateInterval.HOUR);
    validateNotSpecified("next year", DateInterval.MONTH, DateInterval.DAY, DateInterval.HOUR);
//    validateNotSpecified("last decade", DateInterval.YEAR);
  }

  @Test
  public void testVariousMonth() {

    //also includes year:
    validateSpecified("last month", DateInterval.MONTH);
    validateSpecified("this month", DateInterval.MONTH);
    validateSpecified("next month", DateInterval.MONTH);
    validateSpecified("10 months ago", DateInterval.MONTH);
    validateSpecified("in 5 months", DateInterval.MONTH);
    validateSpecified("last month from now", DateInterval.MONTH);
    validateSpecified("2 months before now", DateInterval.MONTH);
    validateSpecified("4 months from now", DateInterval.MONTH);

    //validateSpecified("last june", DateInterval.MONTH);
//    validateSpecified("tomorrow 1 year ago", DateInterval.MONTH); //, DateInterval.MONTH, DateInterval.DAY);
    //validateSpecified("11 january 2 years ago", DateInterval.MONTH); //, DateInterval.MONTH, DateInterval.DAY);
    validateSpecified("2 months from today", DateInterval.MONTH); //, DateInterval.MONTH, DateInterval.DAY);


    //negatives:
    validateNotSpecified("last month", DateInterval.DAY, DateInterval.HOUR);
    validateNotSpecified("this month", DateInterval.DAY, DateInterval.HOUR);
    validateNotSpecified("next month", DateInterval.DAY, DateInterval.HOUR);

  }

  @Test
  public void testVariousWeek() {

//    validateSpecified("last week", DateInterval.MONTH);
//    validateSpecified("this week", DateInterval.MONTH);
//    validateSpecified("next week", DateInterval.MONTH);
//    validateSpecified("10 weeks ago", DateInterval.MONTH);
//    validateSpecified("in 5 weeks", DateInterval.MONTH);
//    validateSpecified("5 weeks from now", DateInterval.MONTH);
//    validateSpecified("2 weeks before now", DateInterval.MONTH);
//    validateSpecified("4 weeks from now", DateInterval.MONTH);
//
//    //validateSpecified("11 january 2 years ago", DateInterval.MONTH);
//    validateSpecified("10 weeks from today", DateInterval.MONTH);

    //negatives
    validateNotSpecified("last week", DateInterval.DAY, DateInterval.HOUR);
    validateNotSpecified("this week", DateInterval.DAY, DateInterval.HOUR);
    validateNotSpecified("next week", DateInterval.DAY, DateInterval.HOUR);
  }


  @Test
  public void testVariousDay() {

    validateSpecified("yesterday", DateInterval.DAY);
    validateSpecified("today", DateInterval.DAY);
    validateSpecified("tomorrow", DateInterval.DAY);
    validateSpecified("10 days ago", DateInterval.DAY);
    validateSpecified("in 5 days", DateInterval.DAY);
    validateSpecified("last day from now", DateInterval.DAY);
    validateSpecified("2 days before now", DateInterval.DAY);
    validateSpecified("4 days from now", DateInterval.DAY);

    validateSpecified("last tuesday", DateInterval.DAY);
    validateSpecified("tomorrow 1 year ago", DateInterval.DAY);
    //validateSpecified("11 january 2 years ago", DateInterval.DAY);
    validateSpecified("10 days from today", DateInterval.DAY);

    //negatives
    validateNotSpecified("yesterday", DateInterval.HOUR);
    validateNotSpecified("today", DateInterval.HOUR);
    validateNotSpecified("tomorrow", DateInterval.HOUR);
  }

  @Test
  public void testVariousHour() {

    validateSpecified("last hour", DateInterval.HOUR);
    validateSpecified("this hour", DateInterval.HOUR);
    validateSpecified("next hour", DateInterval.HOUR);
    validateSpecified("10 hours ago", DateInterval.HOUR);
    validateSpecified("in 5 hours", DateInterval.HOUR);
    validateSpecified("last hour from now", DateInterval.HOUR);
    validateSpecified("2 hours before now", DateInterval.HOUR);
    validateSpecified("4 hours from now", DateInterval.HOUR);
    
    //validateSpecified("this time 1 year ago", DateInterval.HOUR);
//    validateSpecified("2 PM 1 year ago", DateInterval.HOUR);
//    validateSpecified("2 PM 11 january 2 years ago", DateInterval.HOUR);

  }

  @Test
  public void testOnlyFullYearSpecifiedYYYY() throws Exception {
    validateSpecified("2009", DateInterval.YEAR);
    validateNotSpecified("2030", DateInterval.MONTH, DateInterval.DAY, DateInterval.HOUR);
  }

  @Test
  public void testTrelloExamples() {
//    “23 June 2014” - time inferred
//    “23 June” - time inferred, year inferred
//    “23rd” - time inferred, year inferred, month inferred
//    “2014” - time inferred, month inferred, day inferred
//    “12:45pm” - date inferred, year inferred, month inferred, day inferred.
    validateSpecified("23 June 2014", DateInterval.DAY);
    validateNotSpecified("23 June 2014", DateInterval.HOUR);
//
    validateSpecified("23 June", DateInterval.DAY);
    validateNotSpecified("23 June", DateInterval.YEAR, DateInterval.HOUR);
//
    //this does not get parsed as date at all
//    List<DateGroup> dates = _parser.parse("23rd");
//    validateSpecified("23rd", DateInterval.DAY);
//    validateNotSpecified("23rd", DateInterval.YEAR, DateInterval.MONTH, DateInterval.HOUR);
//
    validateSpecified("12:45pm", DateInterval.HOUR);
    validateNotSpecified("12:45pm", DateInterval.YEAR, DateInterval.MONTH, DateInterval.DAY);

  }

  private void validateSpecified(String value, DateInterval... intervals) {
    DateGroup date = parseToSingleDate(value);
    for (DateInterval interval : intervals) {
      assertSpecifiedInterval(date, interval, true);
    }
  }

  private void validateNotSpecified(String value, DateInterval... intervals) {
    DateGroup date = parseToSingleDate(value);

    for (DateInterval interval : intervals) {
      assertSpecifiedInterval(date, interval, false);
    }
  }

  private DateGroup parseToSingleDate(String value) {
    List<DateGroup> result = _parser.parse(value);
    assertEquals(1, result.size());

    DateGroup date = result.get(0);
    return date;

  }

  private Set<DateInterval> intervalsExcept(DateInterval[] except) {
    Set intervals = new HashSet<DateInterval>();
    intervals.addAll(Arrays.asList(DateInterval.values()));
    intervals.removeAll(Arrays.asList(except));
    return intervals;
  }

  private void assertSpecifiedInterval(DateGroup date, DateInterval interval, boolean expected) {
    switch (interval) {
      case YEAR:
        assertEquals("year interval", expected, date.isYearSpecified());
        break;
      case MONTH:
        assertEquals("month interval", expected, date.isMonthSpecified());
        break;
      case DAY:
        assertEquals("day interval", expected, date.isDaySpecified());
        break;
      case HOUR:
        assertEquals("hour interval", expected, date.isHourSet());
        break;
    }
  }
}
