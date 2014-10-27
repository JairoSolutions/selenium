package com.example.tests;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class SeleniumJAVA01 extends SeleneseTestNgHelper {
	@Test public void testSeleniumJAVA01() throws Exception {
		package com.example.tests;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class SeleniumJAVA01 extends SeleneseTestNgHelper {
	@Test public void testSeleniumJAVA01() throws Exception {
		selenium.open("/");
		selenium.click("link=Store");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=exact:Tron: Legacy");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=product_155_submit_button");
		selenium.select("name=product_rating", "label=2");
		selenium.type("id=s", "firth");
		selenium.click("id=searchsubmit");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=The King’s Speech");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=product_rating", "label=3");
		selenium.click("id=product_160_submit_button");
		selenium.click("link=Checkout");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=form.adjustform.remove > input[name=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span > input[name=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(""));
	}
}
