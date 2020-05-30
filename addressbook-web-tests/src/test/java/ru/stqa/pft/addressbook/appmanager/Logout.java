package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends HelperBase{


    public Logout(WebDriver wd) {
        super(wd);
    }

    public void logoutPage() {

        click(By.linkText("Logout"));
    }
}
