package org.demo.pages;

import org.demo.tool.AutomationTool;

public class HomePage extends Page {

    public HomePage(String sBroswerName, String sUrlSite) {
        Tool = new AutomationTool();
        Tool.OpenBroswer(sBroswerName);
    }

    @Override
    public Boolean OpenPage(){
        Tool.GoToPage(sUrlPage);
        return true;
    }

    public Boolean Close(){
        Tool.CloseBrowser();
        return true;
    }
}
