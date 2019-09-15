package contacts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name;
    private String surname;
    private String phoneNumber = "[no number]";

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if (checkPhoneNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Wrong number format!");
            this.phoneNumber = "[no number]";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" + name +" " + surname + ", " + phoneNumber;
    }

    private boolean checkPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("\\+?" +
                "((\\([0-9A-Za-z]{1,}\\)|[0-9A-Za-z]{1,})"
                +"|([0-9A-Za-z]{1,}[ -]\\([0-9A-Za-z]{2,}\\))|[0-9A-Za-z]{1,}[ -][0-9A-Za-z]{2,})"
                +"([ -][0-9A-Za-z]{2,}[ -]?)*");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
