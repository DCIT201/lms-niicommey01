package org.example;

public class Patron {
    private String patronName;
    private String patronID;
    private String patronEmail;

    public Patron(String patronName, String patronID, String patronEmail) {
        this.patronName = patronName;
        this.patronID = patronID;
        this.patronEmail = patronEmail;
    }

    public String getPatronName() {
        return patronName;
    }

    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    public String getPatronID() {
        return patronID;
    }

    public void setPatronID(String patronID) {
        this.patronID = patronID;
    }

    public String getPatronEmail() {
        return patronEmail;
    }

    public void setPatronEmail(String patronEmail) {
        this.patronEmail = patronEmail;
    }

    @Override
    public String toString() {
        return "Patron Information" +
                "\nPatron Name: " + patronName +
                "\nPatron ID: " + patronID +
                "\nPatron Email: " + patronEmail;
    }
}
