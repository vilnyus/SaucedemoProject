package org.demo.pages;

import org.demo.tool.AutomationTool;

public class Page {
    public static AutomationTool Tool;
    protected String sUrlPage;
    protected String sBrowserName;
    protected String sCurrentUrl;

    public Boolean OpenPage(){
        return true;
    }

    public Boolean ClosePage(){
        return true;
    }
}
