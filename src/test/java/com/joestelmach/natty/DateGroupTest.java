package com.joestelmach.natty;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.*;

public class DateGroupTest extends AbstractTest {

  private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
  private DateGroup dateGroup;

  @Before
  public void setUp() {
    initCalendarAndParser();
    dateGroup = new DateGroup();
    Date date = fromString("2000-06-15 09:30");
    dateGroup.addDate(date);
  }

  @Test
  public void whenNothingSpecifiedShouldHaveRangeOfTheYear() throws Exception {

    validateMinDate(dateGroup, 1, 1, 2000, 0);
    validateMaxDate(dateGroup, 12, 31, 2000, 23);
  }

  @Test
  public void whenYearSpecifiedShouldHaveRangeOfTheYear() throws Exception {

    dateGroup.markYearSpecified();
    validateMinDate(dateGroup, 1, 1, 2000, 0);
    validateMaxDate(dateGroup, 12, 31, 2000, 23);
  }

  @Test
  public void whenMonthSpecifiedShouldHaveRangeOfTheMonth() throws Exception {

    dateGroup.markMonthSpecified();
    validateMinDate(dateGroup, 6, 1, 2000, 0);
    validateMaxDate(dateGroup, 6, 30, 2000, 23);
  }

  @Test
  public void whenYearAndMonthSpecifiedShouldHaveRangeOfTheMonth() throws Exception {

    dateGroup.markYearSpecified();
    dateGroup.markMonthSpecified();
    validateMinDate(dateGroup, 6, 1, 2000, 0);
    validateMaxDate(dateGroup, 6, 30, 2000, 23);
  }

  @Test
  public void whenDayOfMonthSpecifiedShouldHaveRangeOfDaysBetweenJanDateToDecDateSpecified() throws Exception {

    dateGroup.markDaySpecified();
    validateMinDate(dateGroup, 1, 15, 2000, 0);
    validateMaxDate(dateGroup, 12, 15, 2000, 23);
  }

  @Test
  public void whenDayAndMonthSpecifiedShouldHaveRangeOfTheDay() throws Exception {

    dateGroup.markMonthSpecified();
    dateGroup.markDaySpecified();
    validateMinDate(dateGroup, 6, 15, 2000, 0);
    validateMaxDate(dateGroup, 6, 15, 2000, 23);
  }

  @Test
   public void whenHourOfDaySpecifiedShouldHaveRangeOfHoursBetweenJan1stToDec31stWithinTheHourSpecified() throws Exception {

    dateGroup.markHourSpecified();
    validateMinDate(dateGroup, 1, 1, 2000, 9);
    validateMaxDate(dateGroup, 12, 31, 2000, 9);
  }

  @Test
  public void whenDayAndHourOfDaySpecifiedShouldHaveRangeOfHoursBetweenJanDateSpecifiedToDecDateSpecified() throws Exception {

    dateGroup.markDaySpecified();
    dateGroup.markHourSpecified();
    validateMinDate(dateGroup, 1, 15, 2000, 9);
    validateMaxDate(dateGroup, 12, 15, 2000, 9);
  }

  @Test
  public void whenMonthDayAndHourOfDaySpecifiedShouldHaveRangeOfHoursBetweenJanDateSpecifiedToDecDateSpecified() throws Exception {

    dateGroup.markDaySpecified();
    dateGroup.markHourSpecified();
    validateMinDate(dateGroup, 1, 15, 2000, 9);
    validateMaxDate(dateGroup, 12, 15, 2000, 9);
  }

  protected void validateMinDate(DateGroup dateGroup, int month, int day, int year, int hour) {
    Date parsedDate = dateGroup.getDatesWithInferredFieldsSetToMinimum().get(0);
    validateDateTime(parsedDate, month, day, year, hour, 0, 0);
  }

  protected void validateMaxDate(DateGroup dateGroup, int month, int day, int year, int hour) {
    Date parsedDate = dateGroup.getDatesWithInferredFieldsSetToMaximum().get(0);
    validateDateTime(parsedDate, month, day, year, hour, 59, 59);
  }

  private Date fromString(String yyyyMMddHHMM) {
    try {
      return dateFormat.parse(yyyyMMddHHMM);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}