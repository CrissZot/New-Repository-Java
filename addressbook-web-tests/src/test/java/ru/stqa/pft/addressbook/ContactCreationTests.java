package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{



  @Test
  public void testContactCreation() throws Exception {

    gotoAddNewPage();
    ContactData(new ContactData("Имя", "Фамилия", "Город, улица, дом, квартира", "86543216545", "86546546542", "89765432132", "1@mail.ru", "2@mail.ru", "3@mail.ru"));
    homePageContact();

  }
}
