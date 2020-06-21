package Models;

public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;

    public Trainer(String firstName, String lastName, String Subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = Subject;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String Subject) {
        this.subject = Subject;
    }

    @Override
    public String toString() {
        return "Trainer {" + "First Name :" + firstName + ", Last Name :" + lastName + ", Subject :" + subject + '}';
    }

}
