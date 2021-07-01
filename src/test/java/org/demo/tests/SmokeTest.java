package org.demo.tests;

import org.demo.site.DemoSite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    DemoSite site;

    public SmokeTest() {
        site = new DemoSite();
    }

    @Test(priority = 0)
    public void SmokeTest1(){
        Boolean bResult = false;

        bResult = site.Login();
        Assert.assertTrue(bResult, "Login Failed");
    }

    @Test(priority = 2)
    public void SmokeTest2(){
        Boolean bClickResult = false;

        bClickResult = site.ClickBurgerMenu();
        Assert.assertTrue(bClickResult, String.valueOf(true));
        site.CloseSite();
    }
}
