package esercizio3;

import java.util.Date;

public class Cliente {
    private String clientID;
    private String firstname;
    private String lastname;
    private String emailAddress;
    private Date signUpDate;

    //costruttore
    public Cliente(String clientID, String firstname, String lastname, String emailAddress, Date signUpDate) {
        this.clientID = clientID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
        this.signUpDate = signUpDate;
    }

    //getter

    public String getClientID() {
        return this.clientID;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public Date getSignUpDate() {
        return this.signUpDate;
    }

    //metodi set
    public String setEmailAddress(String newEmailAddress) {
        return this.emailAddress=newEmailAddress;
    }

}
