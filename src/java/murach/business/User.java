/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

/**
 *
 * @author hango
 */
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;
    private String heardFrom;
    private boolean wantsUpdates;
    private String contactVia;

    // Constructor
    public User(String email, String firstName, String lastName, Date dob, String heardFrom, boolean wantsUpdates, String contactVia) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.dob = dob;
    this.heardFrom = heardFrom;
    this.wantsUpdates = wantsUpdates;
    this.contactVia = contactVia;
}

    // Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public boolean isWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(boolean wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }
}