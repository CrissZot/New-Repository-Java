package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumberHome;
    private final String phoneNumberMobile;
    private final String phoneNumberWork;
    private final String email1;
    private final String email2;
    private final String email3;

    public ContactData(String FirstName, String LastName, String Address, String PhoneNumberHome, String PhoneNumberMobile, String PhoneNumberWork, String Email1, String Email2, String Email3) {
        firstName = FirstName;
        lastName = LastName;
        address = Address;
        phoneNumberHome = PhoneNumberHome;
        phoneNumberMobile = PhoneNumberMobile;
        phoneNumberWork = PhoneNumberWork;
        email1 = Email1;
        email2 = Email2;
        email3 = Email3;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public String getPhoneNumberMobile() {
        return phoneNumberMobile;
    }

    public String getPhoneNumberWork() {
        return phoneNumberWork;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }
}
