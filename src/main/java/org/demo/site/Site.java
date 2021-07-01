package org.demo.site;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Site {
    public String       sBrowserName;
    public String       sURLSite;
    public String       sUserName;
    public String       sPassword;
    public Properties   prop;

    public String getsBroswerName() {
        return sBrowserName;
    }

    public String getsURLSite() {
        return sURLSite;
    }

    public String getsUserName() {
        return sUserName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public Site(){
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("D:\\Selenium_Projects\\SaucedemoProject\\src\\main\\java\\org\\demo\\comfig\\config.properties");
            prop.load(fis);

            sBrowserName    = prop.getProperty("browser");
            sURLSite        = prop.getProperty("url");
            sUserName       = prop.getProperty("user");
            sPassword       = prop.getProperty("password");
        } catch (FileNotFoundException e ){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
