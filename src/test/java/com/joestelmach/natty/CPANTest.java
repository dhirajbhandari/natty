package com.joestelmach.natty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author Joe Stelmach
 */
public class CPANTest {

  private Logger _logger = Logger.getLogger(CPANTest.class.getName());

  @Test
  public void sanityCheck() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        CPANTest.class.getResourceAsStream("/cpan.txt")));
    String value = null;
    while((value = reader.readLine()) != null) {
      if(!value.trim().startsWith("#") && value.trim().length() > 0) {
        Parser parser = new Parser();
        StringBuilder sb = new StringBuilder().append("[").append(value).append("] -> ");
        List<DateGroup> groups = parser.parse(value);
        Assert.assertEquals(1, groups.size());
        DateGroup dg = groups.get(0);
        if (dg.isYearSpecified()) sb.append(" year");
        if (dg.isMonthSpecified()) sb.append(" month");
        if (dg.isDaySpecified()) sb.append(" day");
        if (dg.isHourSpecified()) sb.append(" hour");
        if (!dg.isTimeInferred()) sb.append(" time");
        debug(sb.toString());
        Assert.assertTrue(groups.get(0).getDates().size() > 0);

      }
    }
    
    reader.close();
  }

  private void debug(String msg) {
    _logger.finest(msg);
  }
}
