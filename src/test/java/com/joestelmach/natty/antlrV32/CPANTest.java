package com.joestelmach.natty.antlrV32;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author Joe Stelmach
 */
public class CPANTest {
  
  @Test
  public void sanityCheck() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        CPANTest.class.getResourceAsStream("/cpan.txt")));
    String value = null;
    while((value = reader.readLine()) != null) {
      if(!value.trim().startsWith("#") && value.trim().length() > 0) {
        Parser parser = new Parser();
        String s = "[" + value + "] -> ";
        System.out.print(s);
        List<DateGroup> groups = parser.parse(value);
        Assert.assertEquals(1, groups.size());
        DateGroup dg = groups.get(0);
        s = "";
        if (!dg.isYearSpecified()) s = s + " year";
        if (!dg.isTimeInferred()) s = s + " time";
//        System.out.print(String.format(" yearIF: %s timeIF: %s", dg.isYearSpecified(), dg.isTimeInferred()));
        System.out.print(s);
        Assert.assertTrue(groups.get(0).getDates().size() > 0);
        System.out.println();
      }
    }
    
    reader.close();
  }
}
