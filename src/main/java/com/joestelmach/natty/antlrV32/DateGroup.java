package com.joestelmach.natty.antlrV32;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

//import org.antlr.runtime.tree.Tree;
import org.antlr.v32.runtime.tree.Tree;

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
  private boolean yearSpecified;
  private boolean monthSpecified;
  private boolean daySpecified;
  private boolean hourSpecified;

  private Date _recurringUntil;
  private Map<String, List<ParseLocation>> _parseLocations;
  private Tree _syntaxTree;

  public DateGroup() {
    _dates = new ArrayList<Date>();
    //assume not specified unless set
    _isTimeInferred = true;
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
    return yearSpecified;
  }

  public void markYearSpecified() {
    yearSpecified = true;
  }

  public boolean isMonthSpecified() {
    return monthSpecified;
  }

  public void markMonthSpecified() {
    this.monthSpecified = true;
  }

  public boolean isDaySpecified() {
    return daySpecified;
  }

  public void markDaySpecified() {
    this.daySpecified = true;
  }

  public boolean isHourSet() {
    return hourSpecified;
  }

  public void markHourSpecified() {
    //hour is explicitly set
    this.hourSpecified = true;
  }
}
