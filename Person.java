package landscapecompany;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty phone;
    private SimpleStringProperty email;

    /** no arg constructor */
    public Person() {
    }

    /** constructor with firstName, lastName, phone, email
     * @param firstName
     * @param lastName
     * @param phone
     * @param email */
    public Person(String firstName, String lastName, String phone, String email) {
        this.firstName = new SimpleStringProperty (firstName);
        this.lastName = new SimpleStringProperty (lastName);
        this.phone = new SimpleStringProperty (phone);
        this.email = new SimpleStringProperty (email);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(SimpleStringProperty firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(SimpleStringProperty lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone.get();
    }

    public void setPhone(SimpleStringProperty phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(SimpleStringProperty email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "; Phone: "
                + phone + "; Email: " + email;
    }
}
