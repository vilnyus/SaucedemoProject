package org.demo.pages;

public class LoginPage extends Page{
    //Locators
    String sUrlPage;

    public LoginPage(String sUrl) {
        this.sUrlPage = sUrl;

    }

    public Boolean Login(String sUserName, String sPassword){
        Boolean bResult = true;
        Tool.GoToPage(sUrlPage); //driver.get(sUrlSite);
        Tool.LoginSubmit(sUserName, sPassword);
        return bResult;
    }
}
