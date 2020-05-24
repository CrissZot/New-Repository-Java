package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    WebDriver wd;

    public Logout(WebDriver wd) {
        this.wd = wd;
    }

    public void logoutGroupPage() {
        wd.findElement(By.linkText("Logout")).click();
    }
}
