package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{



  @Test
  public void testContactCreation() throws Exception {

    app.gotoAddNewPage();
    app.ContactData(new ContactData("Имя", "Фамилия", "Город, улица, дом, квартира", "86543216545", "86546546542", "89765432132", "1@mail.ru", "2@mail.ru", "3@mail.ru"));
    app.homePageContact();
    app.logoutGroupPage();
  }
}
