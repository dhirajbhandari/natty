package com.joestelmach.natty;


import java.util.*;

import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Joe Stelmach
 */
public class DateGroup {
  private List<Date> _dates;
  private String _text;
  private int _line;
  private int _position;
  private boolean _isRecurring;
  private boolean _isTimeInferred;

  private Date _recurringUntil;
  private Map<String, List<ParseLocation>> _parseLocations;
  private Tree _syntaxTree;

  // BEGIN: Patch
  private boolean[] _nonInferredFields;
  // END: Patch

  public DateGroup() {
    _dates = new ArrayList<Date>();
    //assume not specified unless set
    _isTimeInferred = true;
    // BEGIN: Patch
    _nonInferredFields = new boolean[Calendar.FIELD_COUNT];
    // END: Patch
  }

  public List<Date> getDates() {
    return _dates;
  }
  public void addDate(Date date) {
    _dates.add(date);
  }

  public String getText() {
    return _text;
  }
  public void setText(String text) {
    _text = text;
  }

  public int getLine() {
    return _line;
  }
  public void setLine(int line) {
    _line = line;
  }

  public int getPosition() {
    return _position;
  }
  public void setPosition(int position) {
    _position = position;
  }

  public boolean isRecurring() {
    return _isRecurring;
  }
  public void setRecurring(boolean isRecurring) {
    _isRecurring = isRecurring;
  }

  /**
   * @return true if the time information in this date group has been inferred
   * as opposed to being explicity defined in the _text input.
   */
  public boolean isTimeInferred() {
    return _isTimeInferred;
  }
  public void setIsTimeInferred(boolean isTimeInferred) {
    this._isTimeInferred = isTimeInferred;
  }

  public Date getRecursUntil() {
    return _recurringUntil;
  }
  public void setRecurringUntil(Date recurringUntil) {
    _recurringUntil = recurringUntil;
  }

  public Map<String, List<ParseLocation>> getParseLocations() {
    return _parseLocations;
  }
  public void setParseLocations(Map<String, List<ParseLocation>> parseLocations) {
    _parseLocations = parseLocations;
  }

  public Tree getSyntaxTree() {
    return _syntaxTree;
  }

  public void setSyntaxTree(Tree syntaxTree) {
    _syntaxTree = syntaxTree;
  }

  // BEGIN: Patch

  /**
   * @return true if the year information in this date group has been
   * explicitly specified in the _text input as opposed to being inferred.
   * Eg:
   * <code>
   *   "last year" -> specified
   *   "in may"    -> not specified
   * </code>
   */
  public boolean isYearSpecified() {
    return isFieldSpecified(Calendar.YEAR);
  }

  public boolean isMonthSpecified() {
    return isFieldSpecified(Calendar.MONTH);
  }

  public boolean isDaySpecified() {
    return isFieldSpecified(Calendar.DAY_OF_MONTH);
  }

  public boolean isHourSpecified() {
    return isFieldSpecified(Calendar.HOUR);
  }

  public void markYearSpecified() {
    markFieldSpecified(Calendar.YEAR);
  }

  public void markMonthSpecified() {
    markFieldSpecified(Calendar.MONTH);
  }

  public void markDaySpecified() {
    markFieldSpecified(Calendar.DAY_OF_MONTH);
  }

  public void markHourSpecified() {
    //TODO: do we have the case where we dont know AM or PM?
    markFieldSpecified(Calendar.HOUR);
    markFieldSpecified(Calendar.HOUR_OF_DAY);
  }

  public List<Date> getDatesWithInferredFieldsSetToMinimum()
  {
    List<Date> dates = new ArrayList<Date>();
    for (Date date : getDates())
    {
      Calendar cal = Calendar.getInstance();
      cal.setTime(date);
      if (isFieldInferred(Calendar.YEAR))
      {
        // Leave as current year
        // TODO in the future could think about all years?
      }
      if (isFieldInferred(Calendar.MONTH))
      {
        cal.set(Calendar.MONTH, Calendar.JANUARY);
      }

      assert Calendar.DAY_OF_MONTH == Calendar.DATE;
      if (isFieldInferred(Calendar.DAY_OF_MONTH))
      {
        cal.set(Calendar.DAY_OF_MONTH, 1);
      }
      if (isFieldInferred(Calendar.HOUR) || isFieldInferred(Calendar.HOUR_OF_DAY))
      {
        cal.set(Calendar.HOUR_OF_DAY, 0);
      }
      if (isFieldInferred(Calendar.MINUTE))
      {
        cal.set(Calendar.MINUTE, 0);
      }
      if (isFieldInferred(Calendar.SECOND))
      {
        cal.set(Calendar.SECOND, 0);
      }
      if (isFieldInferred(Calendar.MILLISECOND))
      {
        cal.set(Calendar.MILLISECOND, 0);
      }
      dates.add(cal.getTime());
    }
    return dates;
  }

  public List<Date> getDatesWithInferredFieldsSetToMaximum()
  {
    List<Date> dates = new ArrayList<Date>();
    for (Date date : getDates())
    {
      Calendar cal = Calendar.getInstance();
      cal.setTime(date);
      if (isFieldInferred(Calendar.YEAR))
      {
        // Leave as current year
        // TODO in the future could think about all years?
      }
      if (isFieldInferred(Calendar.MONTH))
      {
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
      }
      assert Calendar.DAY_OF_MONTH == Calendar.DATE;
      if (isFieldInferred(Calendar.DAY_OF_MONTH))
      {
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
      }
      if (isFieldInferred(Calendar.HOUR) || isFieldInferred(Calendar.HOUR_OF_DAY))
      {
        cal.set(Calendar.HOUR_OF_DAY, 23);
      }
      if (isFieldInferred(Calendar.MINUTE))
      {
        cal.set(Calendar.MINUTE, 59);
      }
      if (isFieldInferred(Calendar.SECOND))
      {
        cal.set(Calendar.SECOND, 59);
      }
      if (isFieldInferred(Calendar.MILLISECOND))
      {
        cal.set(Calendar.MILLISECOND, 999);
      }
      dates.add(cal.getTime());
    }
    return dates;
  }

  public boolean isFieldInferred(int field)
  {
    return !_nonInferredFields[field];
  }

  public boolean isFieldSpecified(int field)
  {
    return _nonInferredFields[field];
  }

  public void markFieldSpecified(int field)
  {
    _nonInferredFields[field] = true;
  }
  // END: Patch
}
