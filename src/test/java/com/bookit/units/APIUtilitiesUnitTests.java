package com.bookit.units;

import com.bookit.utilities.APIUtilities;
import org.junit.Assert;
import org.junit.Test;

public class APIUtilitiesUnitTests {
    @Test
    public void getTokentest(){
      String token= APIUtilities.getToken();
      String tokenStudent=APIUtilities.getToken("student");
      String tokenTeacher=APIUtilities.getToken("teacher");

      Assert.assertNotNull(token);
        Assert.assertNotNull(tokenStudent);
        Assert.assertNotNull(tokenTeacher);
    }
}
