package edu.univercity.testportlet.TestPortlet;

import junit.framework.Assert;
import junit.framework.Test;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest
{
	public void testApp() {
	      App appObject = new App();
	      Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
}

}

