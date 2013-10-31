package co.mymedicalprofile.domain.people;

/**
 * <p>TODO javadoc here, be short, mention purpose and usage of the function.</p>
 *
 * @author mario
 */
public class Name {

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}