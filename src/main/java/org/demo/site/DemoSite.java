package org.demo.site;

import org.demo.pages.HomePage;
import org.demo.pages.LoginPage;
import org.demo.pages.ProductsPage;

public class DemoSite extends Site{

    public LoginPage LoginPage;
    public HomePage HomePage;
    public ProductsPage ProductsPage;

    public DemoSite() {
        HomePage = new HomePage(sBrowserName, sURLSite); //Open browser Tool.OpenBroswer(sBroswerName);
        LoginPage = new LoginPage(sURLSite); //this.sUrlPage = sUrl;
        ProductsPage = new ProductsPage();
    }

    public Boolean Login(){
        return LoginPage.Login(getsUserName(), getsPassword());
    }

    public Boolean ClickBurgerMenu(){
        return ProductsPage.ClickButton();

    }

    public void CloseSite(){
        HomePage.Close();
    }
}
