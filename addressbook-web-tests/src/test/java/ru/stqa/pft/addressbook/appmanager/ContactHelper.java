package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(WebDriver wd) {
      super(wd);

  }

  public void ContactData(ContactData contactData) {
      type(By.name("firstname"), contactData.getFirstName());
      type(By.name("lastname"), contactData.getLastName());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getPhoneNumberHome());
      type(By.name("mobile"),contactData.getPhoneNumberMobile());
      type(By.name("work"), contactData.getPhoneNumberWork());
      type(By.name("email"), contactData.getEmail1());
      type(By.name("email2"), contactData.getEmail2());
      type(By.name("email3"), contactData.getEmail3());
      click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void gotoAddNewPage() {
      click(By.linkText("add new"));
    }
}
