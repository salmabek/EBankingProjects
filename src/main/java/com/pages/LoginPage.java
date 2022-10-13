package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver =driver;
    }
    private final By userName = By.name("uid");
    private final By  password = By.name("password");
    private final By buttonLogin = By.name("btnLogin");


    public void setUserName(String name)
    {
        driver.findElement(userName).sendKeys(name);
    }

    public void setPassword(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickSubmit()
    {
    driver.findElement(buttonLogin).click();
    }


}
