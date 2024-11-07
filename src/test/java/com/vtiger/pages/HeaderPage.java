package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utility.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends PageActions {
    public HeaderPage(WebDriver driver, ExtentTest logger)
    {
        super(driver,logger);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText ="Logout")
    WebElement lnk_logout;

    @FindBy(linkText ="New Lead")
    WebElement lnk_NewLead;

    @FindBy(linkText ="Leads")
    WebElement lnk_leads;

    @FindBy(linkText ="Home")
    WebElement lnk_Home;

    @FindBy(linkText ="New Account")
    WebElement lnk_Account;

  public void verifyLogout()
  {
      ElementExist(lnk_logout,"Link Logout is displayed don Homepage");
  }
    public void verifyHome()
    {

        ElementExist(lnk_Home,"Link Home is displayed don Homepage");
    }

  public void ClickLogout()
  {

      ClickElement(lnk_logout,"Link logout clicked successfully ");
  }
    public void ClickNewLead()
    {

        ClickElement(lnk_NewLead,"Link NewLead clicked successfully ");
    }
    public void ClickLead()
    {
        ClickElement(lnk_leads,"Link Leads clicked successfully");
    }
    public void ClickNewAccount()
    {
        ClickElement( lnk_Account,"Link Account clicked successfully");
    }

}


